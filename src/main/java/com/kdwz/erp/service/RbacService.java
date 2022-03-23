package com.kdwz.erp.service;

import com.kdwz.erp.entity.common.RbacRequest;
import com.kdwz.erp.entity.common.RbacResponse;
import com.kdwz.erp.entity.user.UserRegisterVo;

public interface RbacService {

    RbacResponse authenticate(RbacRequest rbacRequest);

    void register(UserRegisterVo userRegisterVo);

}
