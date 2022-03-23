package com.kdwz.erp.service.impl;

import com.kdwz.erp.entity.user.UserRegisterVo;
import com.kdwz.erp.exception.LoginException;
import com.kdwz.erp.entity.common.RbacRequest;
import com.kdwz.erp.entity.common.RbacResponse;
import com.kdwz.erp.entity.user.User;
import com.kdwz.erp.repository.UserRepository;
import com.kdwz.erp.service.RbacService;
import com.kdwz.erp.util.JwtUtils;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import static com.kdwz.erp.converter.user.UserConverter.toUser;

@Service
public class RbacServiceImpl implements RbacService {

    @Resource
    private UserRepository userRepository;
    @Resource
    private JwtUtils jwtUtils;
    @Resource
    private AuthenticationManager authenticationManager;
    @Resource
    private UserDetailsServiceImpl userDetailsServiceImpl;
    @Resource
    private PasswordEncoder passwordEncoder;


    /**
     * 效验用户名密码 生成token
     * @param rbacRequest 用户名密码
     * @return 返回实体
     */
    @Override
    public RbacResponse authenticate(RbacRequest rbacRequest) {
        String username = rbacRequest.getUserName();
        String password = rbacRequest.getPassword();
        authenticate(username, password);

        final UserDetails userDetails = userDetailsServiceImpl.loadUserByUsername(username);
        String token = jwtUtils.generateToken(userDetails);
        User user = userRepository.findByUserName(username);
        return new RbacResponse(user, token);
    }

    @Override
    public void register(UserRegisterVo userRegisterVo) {
        User user = toUser(userRegisterVo);
        user.setUserPassword(encode(userRegisterVo.getPassword()));
        userRepository.save(user);
    }


    private void authenticate(String username, String password) {
        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
        } catch (Exception e) {
            throw new LoginException("用户名或密码错误");
        }
    }

    private String encode(String password) {
        return passwordEncoder.encode(password);
    }
}
