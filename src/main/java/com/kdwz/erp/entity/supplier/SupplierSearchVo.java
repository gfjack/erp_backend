package com.kdwz.erp.entity.supplier;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel("供应商搜索实体")
@Data
public class SupplierSearchVo {

    @ApiModelProperty("供应商名称")
    private String supplierName;

    @ApiModelProperty("联系人名称")
    private String contactName;

}
