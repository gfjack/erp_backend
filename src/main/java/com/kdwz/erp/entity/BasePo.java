package com.kdwz.erp.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.security.core.context.SecurityContextHolder;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import java.io.Serializable;
import java.util.Date;

@Data
@MappedSuperclass
@ApiModel("Po基类")
public class BasePo implements Serializable {

    @ApiModelProperty("创建者")
    @Column(name = "create_by")
    private String createBy;

    @ApiModelProperty("创建时间")
    @Column(name = "create_date")
    private Date createDate;

    @ApiModelProperty("更新人")
    @Column(name = "update_by")
    private String updateBy;

    @ApiModelProperty("更新时间")
    @Column(name = "update_date")
    private Date updateDate;

    @PrePersist
    protected void onPrePersist() {
        if (null == createBy) {
            this.createBy = SecurityContextHolder.getContext().getAuthentication().getName();
        }
        if (null == createDate) {
            this.createDate = new Date();
        }

        this.updateBy = this.createBy;
        this.updateDate = this.createDate;
    }

    @PreUpdate
    protected void onPreUpdate() {
        this.updateBy = SecurityContextHolder.getContext().getAuthentication().getName();
        this.updateDate = new Date();
    }

}
