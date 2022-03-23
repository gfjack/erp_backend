package com.kdwz.erp.config.rbacConfig;

import com.kdwz.erp.service.impl.UserDetailsServiceImpl;
import com.kdwz.erp.util.JwtUtils;
import io.jsonwebtoken.ExpiredJwtException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.annotation.Resource;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static com.kdwz.erp.constant.Constant.TOKEN_START;

@Component
public class JwtRequestFilter extends OncePerRequestFilter {

    @Resource
    private JwtUtils jwtUtils;

    @Resource
    private UserDetailsServiceImpl userDetailsService;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws IOException, ServletException {

        // 获取token
        final String header = request.getHeader("Authorization");
        String jwtToken = null;
        String username = null;
        if (null != header && header.startsWith(TOKEN_START)) {
            jwtToken = header.substring(7);
            try {
                username = jwtUtils.extractUsername(jwtToken);
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException("TOKEN错误");
            } catch (ExpiredJwtException e) {
                throw new RuntimeException("登陆时间过期, 请重新登陆");
            }
        }

        // 读取用户信息, 写入权限和用户
        if (username != null && SecurityContextHolder.getContext().getAuthentication() == null) {
            UserDetails userDetails = userDetailsService.loadUserByUsername(username);

            if (jwtUtils.validateToken(jwtToken, userDetails)) {
                UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken =
                        new UsernamePasswordAuthenticationToken(userDetails,
                        null,
                        userDetails.getAuthorities());

                usernamePasswordAuthenticationToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
                // 写入用户信息到框架contextHolder
                SecurityContextHolder.getContext().setAuthentication(usernamePasswordAuthenticationToken);
            }
        }

        filterChain.doFilter(request, response);

    }
}
