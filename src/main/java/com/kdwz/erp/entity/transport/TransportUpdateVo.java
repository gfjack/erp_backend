package com.kdwz.erp.entity.transport;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel("运输更新实体")
@Data
public class TransportUpdateVo {

    @ApiModelProperty("银行名称")
    private String bankName;

    @ApiModelProperty("银行账号")
    private String bankAccountNum;

    @ApiModelProperty("银行注册地址行号")
    private String bankLocationNum;

    @ApiModelProperty("公司注册地址")
    private String registeredAddr;

    @ApiModelProperty("公司真实联系地址")
    private String realAddr;

    @ApiModelProperty("纳税人识别号")
    private String taxNum;

    @ApiModelProperty("联系邮箱")
    private String email;

}
