package com.kdwz.erp.entity.invoice;


import com.kdwz.erp.constant.CompanyType;
import com.vladmihalcea.hibernate.type.json.JsonStringType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

@ApiModel("发票表")
@Data
@Entity
@Table(name = "t_invoice")
@TypeDef(name = "json", typeClass = JsonStringType.class)
public class InvoicePo implements Serializable {

    @ApiModelProperty("发票id")
    @Id
    @Column(name = "invoice_id")
    @GeneratedValue
    private Long id;

    @ApiModelProperty("订单编号")
    @Column(name = "order_num")
    private String orderNum;

    @ApiModelProperty("总金额")
    @Column(name = "total_amount", precision = 15, scale = 4)
    private BigDecimal totalAmount;

    @ApiModelProperty("已付金额")
    @Column(name = "paid_amount", precision = 15, scale = 4)
    private BigDecimal paidAmount;

    @ApiModelProperty("发票开具详情")
    @Column(name = "invoice_details", columnDefinition = "json")
    @Type(type = "json")
    private List<Map<String, BigDecimal>> invoiceDetails;

    @ApiModelProperty("是否开具完成")
    @Column(name = "is_done")
    private Boolean isDone;

    @ApiModelProperty("发票类型, 0-客户发票, 1-供应商发票, 2-物流发票")
    @Column(name = "invoice_type")
    private CompanyType invoiceType;

    @ApiModelProperty("备注")
    @Column(name = "notes")
    private String notes;

}
