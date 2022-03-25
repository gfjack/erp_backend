package com.kdwz.erp.entity.orderDetails;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

@ApiModel("订单细节实体")
@Data
public class OrderDetailsVo {

    @ApiModelProperty("订单细节id")
    private Long orderDetailId;

    @ApiModelProperty("商品名")
    private String goodName;

    @ApiModelProperty("品牌")
    private String brand;

    @ApiModelProperty("材质")
    private String material;

    @ApiModelProperty("规格")
    private String size;

    @ApiModelProperty("此品种供应商, 必须从此订单的供应商中选取")
    private String goodSupplier;

    @ApiModelProperty("此品种运输商, 必须从此订单的运输商中选取")
    private String goodTransport;

    @ApiModelProperty("预发件数")
    private BigDecimal preShipNum;

    @ApiModelProperty("预发重量")
    private BigDecimal preShipWeight;

    @ApiModelProperty("实发件数")
    private BigDecimal actualShipNum;

    @ApiModelProperty("实发重量")
    private BigDecimal actualShipWeight;

    @ApiModelProperty("销售单价")
    private BigDecimal saleSinglePrice;

    @ApiModelProperty("销售总价, 自动计算")
    private BigDecimal saleTotalPrice;

    @ApiModelProperty("采购单价")
    private BigDecimal purchaseSinglePrice;

    @ApiModelProperty("采购总价")
    private BigDecimal purchaseTotalPrice;

    @ApiModelProperty("物流单价")
    private BigDecimal transportSinglePrice;

    @ApiModelProperty("物流总价")
    private BigDecimal transportTotalPrice;

    @ApiModelProperty("物流其他费用")
    private BigDecimal transportOtherFee;

    @ApiModelProperty("车牌号")
    private String carPlate;

    @ApiModelProperty("备注")
    private String notes;

}
