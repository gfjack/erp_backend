package com.kdwz.erp.entity.user;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.util.List;

@ApiModel("用户新增实体")
@Data
public class UserRegisterVo {

    @ApiModelProperty(value = "用户名称", required = true)
    @NotBlank(message = "用户名不能为空")
    private String userName;

    @ApiModelProperty(value = "用户电话", required = true)
    @NotBlank(message = "用户电话不能为空")
    private String userPhone;

    @ApiModelProperty(value = "用户密码", required = true)
    @NotBlank(message = "用户密码不能为空")
    private String password;

    @ApiModelProperty(value = "权限", required = true)
    @NotBlank(message = "用户权限不能为空")
    private List<Role> roles;

}
