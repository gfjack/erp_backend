package com.kdwz.erp.entity.common;

import com.kdwz.erp.entity.user.User;
import com.kdwz.erp.entity.user.UserVo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

@ApiModel("权限控制返回实体")
@Data
@AllArgsConstructor
public class RbacResponse {

    @ApiModelProperty("用户信息")
    private UserVo user;

    @ApiModelProperty("登陆成功后, 用户的token")
    private String token;

}
