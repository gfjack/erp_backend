package com.kdwz.erp.entity.transport;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@ApiModel("运输创建实体")
@Data
public class TransportCreateVo {

    @ApiModelProperty("供应商名称")
    @NotBlank(message = "请输入物流名称")
    private String supplierName;

    @ApiModelProperty("联系人姓名")
    @NotBlank(message = "请输入联系人名称")
    private String contactName;

    @ApiModelProperty("联系人电话")
    @NotBlank(message = "请输入联系人电话")
    private String contactNum;

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
