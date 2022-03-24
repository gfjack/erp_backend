package com.kdwz.erp.entity.warehouse;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel("商品查询实体")
@Data
public class GoodSearchVo {

    @ApiModelProperty("品种名")
    private String goodType;

    @ApiModelProperty("品牌")
    private String brand;

    @ApiModelProperty("规格")
    private String size;

    @ApiModelProperty("进货来源")
    private String importSource;

    @ApiModelProperty("存放地点")
    private String location;

}
