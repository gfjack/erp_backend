package com.kdwz.erp.entity.customer;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@ApiModel("创建客户实体")
@Data
public class CustomerCreateVo {

    @ApiModelProperty(value = "客户名称", required = true)
    @NotBlank(message = "客户名称不能为空")
    private String customerName;

    @ApiModelProperty(value = "联系人姓名", required = true)
    @NotBlank(message = "联系人不能为空")
    private String contactName;

    @ApiModelProperty(value = "联系人电话", required = true)
    @NotBlank(message = "联系人电话不能为空")
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
