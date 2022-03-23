package com.kdwz.erp.controller;

import com.kdwz.erp.api.RbacApi;
import com.kdwz.erp.entity.common.RbacRequest;
import com.kdwz.erp.entity.common.RbacResponse;
import com.kdwz.erp.entity.user.UserRegisterVo;
import com.kdwz.erp.service.RbacService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;

@Api("权限登陆控制接口")
@RestController
public class RbacController implements RbacApi {

    @Resource
    private RbacService rbacService;

    @Override
    @ApiOperation("登陆验证")
    @RequestMapping(value = "/authenticate", method = RequestMethod.POST)
    public RbacResponse authenticate(@ApiParam("用户登录实体") @Valid @RequestBody RbacRequest rbacRequest) {
        return rbacService.authenticate(rbacRequest);
    }

    @Override
    @ApiOperation("新增用户, 仅管理员可用")
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public void register(@ApiParam("用户实体") @RequestBody UserRegisterVo userRegisterVo) {
        rbacService.register(userRegisterVo);
    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
        return SecurityContextHolder.getContext().getAuthentication().getName();
    }

}
