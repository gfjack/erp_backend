package com.kdwz.erp.converter.user;

import com.kdwz.erp.entity.user.User;
import com.kdwz.erp.entity.user.UserRegisterVo;

public class UserConverter {

    public static User toUser(UserRegisterVo userRegisterVo) {
        User user = new User();
        user.setUserPhone(userRegisterVo.getUserPhone());
        user.setUserName(userRegisterVo.getUserName());
        user.setRoles(userRegisterVo.getRoles());

        return user;
    }

}
