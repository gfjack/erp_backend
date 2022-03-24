package com.kdwz.erp.entity.profit;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@ApiModel("利润实体")
@Data
public class ProfitVo {

    @ApiModelProperty("订单编号")
    private String orderNum;

    @ApiModelProperty("订单日期")
    private Date orderDate;

    @ApiModelProperty("客户名称")
    private String customerName;

    @ApiModelProperty("销售金额")
    private BigDecimal saleTotalPrice;

    @ApiModelProperty("采购总金额")
    private BigDecimal purchaseTotalPrice;

    @ApiModelProperty("运输总金额")
    private BigDecimal transportTotalPrice;

    @ApiModelProperty("其他费用")
    private BigDecimal otherFee;

    @ApiModelProperty("毛利润")
    private BigDecimal profit;

}
