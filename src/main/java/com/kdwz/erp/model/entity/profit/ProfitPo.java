package com.kdwz.erp.model.entity.profit;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@ApiModel("利润表")
@Data
@Entity
@Table(name = "t_profit")
public class ProfitPo {

    @ApiModelProperty("订单编号")
    @Id
    @Column(name = "order_num")
    private String orderNum;

    @ApiModelProperty("订单日期")
    @Column(name = "order_date")
    private Date orderDate;

    @ApiModelProperty("客户名称")
    @Column(name = "customer_name")
    private String customerName;

    @ApiModelProperty("销售金额")
    @Column(name = "sale_total_price", precision = 15, scale = 4)
    private BigDecimal saleTotalPrice;

    @ApiModelProperty("采购总金额")
    @Column(name = "purchase_total_price", precision = 15, scale = 4)
    private BigDecimal purchaseTotalPrice;

    @ApiModelProperty("运输总金额")
    @Column(name = "transport_total_price", precision = 15, scale = 4)
    private BigDecimal transportTotalPrice;

    @ApiModelProperty("其他费用")
    @Column(name = "other_fee", precision = 15, scale = 4)
    private BigDecimal otherFee;

    @ApiModelProperty("毛利润")
    @Column(name = "profit", precision = 15, scale = 4)
    private BigDecimal profit;

}
