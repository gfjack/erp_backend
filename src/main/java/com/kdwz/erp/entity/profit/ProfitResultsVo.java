package com.kdwz.erp.entity.profit;

import com.kdwz.erp.config.Page;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

@ApiModel("利润实体")
@Data
public class ProfitResultsVo {

    @ApiModelProperty("利润数据")
    private Page.PageResult<ProfitVo> profits;

    @ApiModelProperty("总销售额")
    private BigDecimal totalSalePrice;

    @ApiModelProperty("总采购额")
    private BigDecimal totalPurchasePrice;

    @ApiModelProperty("总物流金额")
    private BigDecimal totalTransportPrice;

    @ApiModelProperty("总共其他费用")
    private BigDecimal totalOtherFees;

    @ApiModelProperty("总毛利润")
    private BigDecimal totalProfit;
}
