package com.kdwz.erp.entity.user;

import com.kdwz.erp.entity.BasePo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@ApiModel("用户表")
@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@Table(name = "t_user")
public class User extends BasePo implements Serializable {

    @ApiModelProperty("用户姓名")
    @Column(name = "user_name")
    @Id
    private String userName;

    @ApiModelProperty("用户电话号码")
    @Column(name = "user_phone")
    private String userPhone;

    @ApiModelProperty("用户密码")
    @Column(name = "user_password")
    private String userPassword;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "USER_ROLE",
            joinColumns = {
                    @JoinColumn(name = "USER_ID")
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "ROLE_ID")
            }
    )
    private List<Role> roles;

}
