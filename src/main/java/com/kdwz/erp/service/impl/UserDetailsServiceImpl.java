package com.kdwz.erp.service.impl;

import com.kdwz.erp.entity.user.User;
import com.kdwz.erp.repository.UserRepository;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 验证用户的身份和权限，从数据库得到用户权限
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Resource
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUserName(username);
        if (ObjectUtils.isEmpty(user)) {
            throw new UsernameNotFoundException("用户名或密码错误");
        }

        return new UserService(user, user.getRoles());
    }
}
