package com.kdwz.erp.api;

import com.kdwz.erp.entity.common.RbacRequest;
import com.kdwz.erp.entity.common.RbacResponse;
import com.kdwz.erp.entity.user.UserRegisterVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Api("用户登陆接口")
public interface RbacApi {

    @ApiOperation("登陆验证")
    @RequestMapping(value = "/authenticate", method = RequestMethod.POST)
    RbacResponse authenticate(@ApiParam("用户登录实体") @RequestBody RbacRequest rbacRequest);

    @ApiOperation("新增用户, 仅管理员可用")
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    void register(@ApiParam("用户实体") @RequestBody UserRegisterVo userRegisterVo);
}
