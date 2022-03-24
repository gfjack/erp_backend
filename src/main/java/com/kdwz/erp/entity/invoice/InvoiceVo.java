package com.kdwz.erp.entity.invoice;

import com.kdwz.erp.constant.CompanyType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

@ApiModel("发票实体")
@Data
public class InvoiceVo {

    @ApiModelProperty("发票id")
    private Long id;

    @ApiModelProperty("订单编号")
    private String orderNum;

    @ApiModelProperty("总金额")
    private BigDecimal totalAmount;

    @ApiModelProperty("已付金额")
    private BigDecimal paidAmount;

    @ApiModelProperty("发票开具详情")
    private List<Map<String, BigDecimal>> invoiceDetails;

    @ApiModelProperty("是否开具完成")
    private Boolean isDone;

    @ApiModelProperty("发票类型, 0-客户发票, 1-供应商发票, 2-物流发票")
    private CompanyType invoiceType;

    @ApiModelProperty("备注")
    private String notes;

}
