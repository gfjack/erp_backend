package com.kdwz.erp.entity.orderDetails;

import com.kdwz.erp.config.Page;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

@ApiModel("订单细节实体")
@Data
public class OrderDetailsResultsVo {

    @ApiModelProperty("订单细节")
    Page.PageResult<OrderDetailsVo> orderDetails;

    @ApiModelProperty("总共预发重量")
    private BigDecimal totalPreWeight;

    @ApiModelProperty("总共实际重量")
    private BigDecimal totalActualWeight;

    @ApiModelProperty("总共采购费用")
    private BigDecimal totalPurchasePrice;

    @ApiModelProperty("总共销售费用")
    private BigDecimal totalSalePrice;

    @ApiModelProperty("总共运输费用")
    private BigDecimal totalTransportPrice;

}
