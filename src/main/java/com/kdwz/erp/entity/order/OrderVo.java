package com.kdwz.erp.entity.order;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Map;

@ApiModel("订单实体")
@Data
public class OrderVo {

    @ApiModelProperty("订单编号")
    private String orderNum;

    @ApiModelProperty("订单日期")
    private Date orderDate;

    @ApiModelProperty("客户名称")
    private String customerName;

    @ApiModelProperty("订单总金额")
    private BigDecimal orderTotalAmount;

    @ApiModelProperty("已付金额")
    private BigDecimal paidAmount;

    @ApiModelProperty("差额")
    private BigDecimal difference;

    @ApiModelProperty("订单是否完成, 系统后台自动判断")
    private Boolean isDoneStatus;

    @ApiModelProperty("订单未完成原因")
    private String unfinishedReason;

    @ApiModelProperty("供应商列表")
    private Map<String, List<BigDecimal>> orderSuppliers;

    @ApiModelProperty("物流商列表")
    private Map<String, List<BigDecimal>> orderTransports;

    @ApiModelProperty("是否一票到达")
    private Boolean isOneInvoice;

    @ApiModelProperty("归属人")
    private List<String> belongs;

}
