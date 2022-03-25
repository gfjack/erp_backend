package com.kdwz.erp.entity.orderDetails;

import com.kdwz.erp.entity.BasePo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@EqualsAndHashCode(callSuper = true)
@ApiModel("订单细节, 每个订单有多个订单细节")
@Data
@Entity
@Table(name = "t_order_details")
public class OrderDetailsPo extends BasePo implements Serializable {

    @ApiModelProperty("订单细节id")
    @Id
    @Column(name = "order_detail_id")
    @GeneratedValue
    private Long orderDetailId;

    @ApiModelProperty("商品名")
    @Column(name = "good_name")
    private String goodName;

    @ApiModelProperty("品牌")
    @Column(name = "brand")
    private String brand;

    @ApiModelProperty("材质")
    @Column(name = "material")
    private String material;

    @ApiModelProperty("规格")
    @Column(name = "size")
    private String size;

    @ApiModelProperty("此品种供应商, 必须从此订单的供应商中选取")
    @Column(name = "good_supplier")
    private String goodSupplier;

    @ApiModelProperty("此品种运输商, 必须从此订单的运输商中选取")
    @Column(name = "good_transport")
    private String goodTransport;

    @ApiModelProperty("预发件数")
    @Column(name = "pre_ship_num", precision = 15, scale = 4)
    private BigDecimal preShipNum;

    @ApiModelProperty("预发重量")
    @Column(name = "pre_ship_weight", precision = 15, scale = 4)
    private BigDecimal preShipWeight;

    @ApiModelProperty("实发件数")
    @Column(name = "actual_ship_num", precision = 15, scale = 4)
    private BigDecimal actualShipNum;

    @ApiModelProperty("实发重量")
    @Column(name = "actual_ship_weight", precision = 15, scale = 4)
    private BigDecimal actualShipWeight;

    @ApiModelProperty("销售单价")
    @Column(name = "sale_single_price", precision = 15, scale = 4)
    private BigDecimal saleSinglePrice;

    @ApiModelProperty("销售总价, 自动计算")
    @Column(name = "sale_total_price", precision = 15, scale = 4)
    private BigDecimal saleTotalPrice;

    @ApiModelProperty("采购单价")
    @Column(name = "purchase_single_price", precision = 15, scale = 4)
    private BigDecimal purchaseSinglePrice;

    @ApiModelProperty("采购总价")
    @Column(name = "purchase_total_price", precision = 15, scale = 4)
    private BigDecimal purchaseTotalPrice;

    @ApiModelProperty("物流单价")
    @Column(name = "transport_single_price", precision = 15, scale = 4)
    private BigDecimal transportSinglePrice;

    @ApiModelProperty("物流总价")
    @Column(name = "transport_total_price", precision = 15, scale = 4)
    private BigDecimal transportTotalPrice;

    @ApiModelProperty("物流其他费用")
    @Column(name = "transport_other_fee", precision = 15, scale = 4)
    private BigDecimal transportOtherFee;

    @ApiModelProperty("车牌号")
    @Column(name = "car_plate")
    private String carPlate;

    @ApiModelProperty("备注")
    @Column(name = "notes")
    private String notes;

}
