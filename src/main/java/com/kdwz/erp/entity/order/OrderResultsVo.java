package com.kdwz.erp.entity.order;

import com.kdwz.erp.config.Page;
import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.math.BigDecimal;

@ApiModel("订单返回实体")
@Data
public class OrderResultsVo {

    private Page.PageResult<OrderVo> orders;

    private BigDecimal totalSalePrice;

    private BigDecimal totalPurchasePrice;

    private BigDecimal totalAmount;

}
