package com.kdwz.erp.converter.user;

import com.kdwz.erp.entity.user.User;
import com.kdwz.erp.entity.user.UserRegisterVo;
import com.kdwz.erp.entity.user.UserVo;

import java.util.ArrayList;
import java.util.List;

public class UserConverter {

    public static User toUser(UserRegisterVo userRegisterVo) {
        User user = new User();
        user.setUserPhone(userRegisterVo.getUserPhone());
        user.setUserName(userRegisterVo.getUserName());
        user.setRoles(userRegisterVo.getRoles());

        return user;
    }

    public static UserVo toUserVo(User user) {
        UserVo userVo = new UserVo();
        userVo.setUserPhone(user.getUserPhone());
        userVo.setUserName(user.getUserName());
        userVo.setRoles(user.getRoles());

        return userVo;
    }

    public static List<UserVo> toUserVos(List<User> users) {
        List<UserVo> res = new ArrayList<>();
        for (User user : users) {
            res.add(toUserVo(user));
        }
        return res;
    }

}
