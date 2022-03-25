package com.kdwz.erp.entity.order;

import com.kdwz.erp.constant.CompanyType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@ApiModel("订单查询实体")
@Data
public class OrderSearchVo {

    @ApiModelProperty("开始时间")
    private Date startTime;

    @ApiModelProperty("结束时间")
    private Date endTime;

    @ApiModelProperty("单位名称 - 针对客户, 是模糊查询")
    private String companyName;

    @ApiModelProperty("单位性质")
    private CompanyType companyType;

    @ApiModelProperty("订单完结状态")
    private Boolean isDoneStatus;

}
