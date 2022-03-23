package com.kdwz.erp.service;

import com.kdwz.erp.entity.common.RbacRequest;
import com.kdwz.erp.entity.common.RbacResponse;
import com.kdwz.erp.entity.user.UserRegisterVo;
import com.kdwz.erp.entity.user.UserVo;

import java.util.List;

public interface RbacService {

    RbacResponse authenticate(RbacRequest rbacRequest);

    void register(UserRegisterVo userRegisterVo);

    List<UserVo> search(String userName);

}
