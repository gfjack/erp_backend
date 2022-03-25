package com.kdwz.erp.entity.order;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Map;

@ApiModel("订单更新实体")
@Data
public class OrderUpdateVo {

    @ApiModelProperty("已付金额")
    private BigDecimal paidAmount;

    @ApiModelProperty("供应商列表")
    private Map<String, List<BigDecimal>> orderSuppliers;

    @ApiModelProperty("物流商列表")
    private Map<String, List<BigDecimal>> orderTransports;

    @ApiModelProperty("是否一票到达")
    private Boolean isOneInvoice;

}
