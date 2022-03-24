package com.kdwz.erp.entity.invoice;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

@ApiModel("发票更新实体")
@Data
public class InvoiceUpdateVo {

    @ApiModelProperty("总金额")
    private BigDecimal totalAmount;

    @ApiModelProperty("已付金额")
    private BigDecimal paidAmount;

    @ApiModelProperty("发票开具详情")
    private List<Map<String, BigDecimal>> invoiceDetails;

    @ApiModelProperty("备注")
    private String notes;

}
