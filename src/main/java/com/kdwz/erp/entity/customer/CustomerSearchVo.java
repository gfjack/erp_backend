package com.kdwz.erp.entity.customer;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel("客户查询实体")
@Data
public class CustomerSearchVo {

    @ApiModelProperty("客户名称")
    private String clientName;

    @ApiModelProperty("客户联系人")
    private String contactName;

}
