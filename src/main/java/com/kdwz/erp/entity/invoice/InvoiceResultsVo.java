package com.kdwz.erp.entity.invoice;

import com.kdwz.erp.config.Page;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

@ApiModel("发票实体")
@Data
public class InvoiceResultsVo {

    @ApiModelProperty("发票")
    private Page.PageResult<InvoiceVo> invoices;

    @ApiModelProperty("总金额")
    private BigDecimal totalPrice;

    @ApiModelProperty("已经金额")
    private BigDecimal finishedPrice;

    @ApiModelProperty("未开金额")
    private BigDecimal unfinishedPrice;

}
