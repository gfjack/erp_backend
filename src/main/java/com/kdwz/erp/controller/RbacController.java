package com.kdwz.erp.controller;

import com.kdwz.erp.api.RbacApi;
import com.kdwz.erp.config.Page;
import com.kdwz.erp.entity.common.RbacRequest;
import com.kdwz.erp.entity.common.RbacResponse;
import com.kdwz.erp.entity.user.UserRegisterVo;
import com.kdwz.erp.entity.user.UserUpdateVo;
import com.kdwz.erp.entity.user.UserVo;
import com.kdwz.erp.service.RbacService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

@Api("权限登陆控制接口")
@RestController
@RequestMapping("/v2")
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
    public void register(@ApiParam("用户实体") @Valid @RequestBody UserRegisterVo userRegisterVo) {
        rbacService.register(userRegisterVo);
    }

    @Override
    @ApiOperation("删除一个用户")
    @RequestMapping(value = "/users/delete/{user_name}", method = RequestMethod.DELETE)
    public void deleteOne(@ApiParam("用户名称") @PathVariable("user_name") String userName) {

    }

    @Override
    @ApiOperation("更新用户")
    @RequestMapping(value = "/users/{user_name}/actions/update", method = RequestMethod.PUT)
    public UserVo update(@ApiParam("用户名称") @PathVariable("user_name") String userName,
                  @ApiParam("用户更新实体") @RequestBody UserUpdateVo userUpdateVo) {
        return null;
    }

    @Override
    @ApiOperation("根据用户名查找用户 模糊查询")
    @RequestMapping(value = "/users/actions/search", method = RequestMethod.GET)
    public List<UserVo> search(@ApiParam("用户名") @RequestParam("user_name") String userName) {
        return rbacService.search(userName);
    }

    @Override
    @ApiOperation("分页查询用户")
    @RequestMapping(value = "/users/actions/query", method = RequestMethod.POST)
    public Page.PageResult<UserVo> query(@ApiParam("offset") @RequestParam("offset") Integer offset,
                                  @ApiParam("limit") @RequestParam("limit") Integer limit) {
        return null;
    }

    @Override
    @ApiOperation("导出所有用户")
    @RequestMapping(value = "/users/actions/export", method = RequestMethod.GET)
    public void export(@ApiParam("是否需要全部导出") @RequestParam("is_all") Boolean isAll,
                @ApiParam("需要导出的用户名称") @RequestParam("user_names") List<String> userNames) {

    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String hello() {
        return SecurityContextHolder.getContext().getAuthentication().getName();
    }

}
