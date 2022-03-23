package com.kdwz.erp.service.impl.rbac;

import com.kdwz.erp.entity.user.User;
import com.kdwz.erp.repository.UserRepository;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import static com.kdwz.erp.constant.Constant.USERNAME_PASSWORD_ERROR;

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
            throw new UsernameNotFoundException(USERNAME_PASSWORD_ERROR);
        }

        return new UserService(user, user.getRoles());
    }
}
