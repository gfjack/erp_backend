package com.kdwz.erp.entity.order;

import com.kdwz.erp.entity.BasePo;
import com.vladmihalcea.hibernate.type.json.JsonStringType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Map;

@EqualsAndHashCode(callSuper = true)
@ApiModel("订单表")
@Data
@Entity
@Table(name = "t_order")
@TypeDef(name = "json", typeClass = JsonStringType.class)
public class OrderPo extends BasePo implements Serializable {

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

    @ApiModelProperty("订单总金额")
    @Column(name = "order_total_amount", precision = 15, scale = 4)
    private BigDecimal orderTotalAmount;

    @ApiModelProperty("已付金额")
    @Column(name = "paid_amount", precision = 15, scale = 4)
    private BigDecimal paidAmount;

    @ApiModelProperty("差额")
    @Column(name = "difference", precision = 15, scale = 4)
    private BigDecimal difference;

    @ApiModelProperty("订单是否完成, 系统后台自动判断")
    @Column(name = "is_done_status")
    private Boolean isDoneStatus;

    @ApiModelProperty("供应商列表")
    @Column(name = "order_suppliers", columnDefinition = "json")
    @Type(type = "json")
    private Map<String, List<BigDecimal>> orderSuppliers;

    @ApiModelProperty("物流商列表")
    @Column(name = "order_transports", columnDefinition = "json")
    @Type(type = "json")
    private Map<String, List<BigDecimal>> orderTransports;

    @ApiModelProperty("是否一票到达")
    @Column(name = "is_one_invoice")
    private Boolean isOneInvoice;

    @ApiModelProperty("归属人")
    @Column(name = "belongs", columnDefinition = "json")
    @Type(type = "json")
    private List<String> belongs;

}
