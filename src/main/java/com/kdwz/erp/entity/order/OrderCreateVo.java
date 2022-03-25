package com.kdwz.erp.entity.order;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Map;

@ApiModel("订单创建实体")
@Data
public class OrderCreateVo {

    @ApiModelProperty("订单日期")
    @NotBlank(message = "订单日期不能为空")
    private Date orderDate;

    @ApiModelProperty("客户名称")
    @NotBlank(message = "客户名称不能为空")
    private String customerName;

    @ApiModelProperty("已付金额")
    private BigDecimal paidAmount;

    @ApiModelProperty("供应商列表")
    private Map<String, List<BigDecimal>> orderSuppliers;

    @ApiModelProperty("物流商列表")
    private Map<String, List<BigDecimal>> orderTransports;

    @ApiModelProperty("是否一票到达")
    private Boolean isOneInvoice;

    @ApiModelProperty("归属人")
    private List<String> belongs;

}
