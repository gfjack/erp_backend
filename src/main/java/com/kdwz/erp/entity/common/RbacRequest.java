package com.kdwz.erp.entity.common;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@ApiModel("用户登陆实体")
@Data
public class RbacRequest {

    @ApiModelProperty("用户名称, 用户电话 - 登陆用")
    @NotBlank(message = "请输入用户名")
    private String userName;

    @ApiModelProperty("用户密码")
    @NotBlank(message = "请输入密码")
    private String password;

}
