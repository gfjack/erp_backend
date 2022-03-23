package com.kdwz.erp.model.entity.warehouse;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@ApiModel("库存表")
@Data
@Entity
@Table(name = "t_good")
public class GoodPo {

    @ApiModelProperty("id")
    @Id
    @Column(name = "good_id")
    @GeneratedValue
    private Long goodId;

    @ApiModelProperty("品种名")
    @Column(name = "good_type")
    private String goodType;

    @ApiModelProperty("品牌")
    @Column(name = "brand")
    private String brand;

    @ApiModelProperty("材质")
    @Column(name = "material")
    private String material;

    @ApiModelProperty("规格")
    @Column(name = "size")
    private String size;

    @ApiModelProperty("进价")
    @Column(name = "import_price", precision = 15, scale = 4)
    private BigDecimal importPrice;

    @ApiModelProperty("进货来源")
    @Column(name = "import_source")
    private String importSource;

    @ApiModelProperty("数量")
    @Column(name = "amount", precision = 15, scale = 4)
    private BigDecimal amount;

    @ApiModelProperty("存放地点")
    @Column(name = "location")
    private String location;

}
