package com.kdwz.erp.entity.warehouse;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

@ApiModel("商品实体")
@Data
public class GoodVo {

    @ApiModelProperty("id")
    private Long goodId;

    @ApiModelProperty("品种名")
    private String goodType;

    @ApiModelProperty("品牌")
    private String brand;

    @ApiModelProperty("材质")
    private String material;

    @ApiModelProperty("规格")
    private String size;

    @ApiModelProperty("进价")
    private BigDecimal importPrice;

    @ApiModelProperty("进货来源")
    private String importSource;

    @ApiModelProperty("数量")
    private BigDecimal amount;

    @ApiModelProperty("存放地点")
    private String location;

}
