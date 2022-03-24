package com.kdwz.erp.entity.warehouse;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;

@ApiModel("商品创建实体")
@Data
public class GoodCreateVo {

    @ApiModelProperty("品种名")
    @NotBlank(message = "请输入品种名")
    private String goodType;

    @ApiModelProperty("品牌")
    private String brand;

    @ApiModelProperty("材质")
    @NotBlank(message = "请输入材质")
    private String material;

    @ApiModelProperty("规格")
    @NotBlank(message = "请输入规格")
    private String size;

    @ApiModelProperty("进价")
    @NotBlank(message = "请输入进价")
    private BigDecimal importPrice;

    @ApiModelProperty("进货来源")
    @NotBlank(message = "请输入进货来源")
    private String importSource;

    @ApiModelProperty("重量")
    @NotBlank(message = "请输入重量")
    private BigDecimal amount;

    @ApiModelProperty("存放地点")
    @NotBlank(message = "请输入存放地点")
    private String location;

}
