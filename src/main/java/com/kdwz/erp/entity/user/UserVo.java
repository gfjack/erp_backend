package com.kdwz.erp.entity.user;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.util.List;

@ApiModel("用户实体")
@Data
public class UserVo {

    @ApiModelProperty(value = "用户名称")
    private String userName;

    @ApiModelProperty(value = "用户电话")
    private String userPhone;

    @ApiModelProperty(value = "权限")
    private List<Role> roles;

}
