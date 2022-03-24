package com.kdwz.erp.entity.transport;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel("运输查询实体")
@Data
public class TransportSearchVo {

    @ApiModelProperty("供应商名称")
    private String supplierName;

    @ApiModelProperty("联系人姓名")
    private String contactName;

}
