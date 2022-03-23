package com.kdwz.erp.entity.user;

import com.kdwz.erp.entity.BasePo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@ApiModel("用户角色表")
@Entity
@Table(name = "t_role")
@EqualsAndHashCode(callSuper = true)
@Data
public class Role extends BasePo implements Serializable {

    @ApiModelProperty("用户角色")
    @Id
    @Column(name = "role_name")
    private String roleName;

    @ApiModelProperty("角色描述信息")
    @Column(name = "description")
    private String description;

}
