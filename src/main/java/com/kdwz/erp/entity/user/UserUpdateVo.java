package com.kdwz.erp.entity.user;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.util.List;

@ApiModel("用户更新实体")
@Data
public class UserUpdateVo {

    @ApiModelProperty(value = "用户电话")
    private String userPhone;

    @ApiModelProperty(value = "用户密码")
    private String password;

    @ApiModelProperty(value = "权限")
    private List<Role> roles;

}
