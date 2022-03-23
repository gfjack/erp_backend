package com.kdwz.erp.entity.transport;

import com.kdwz.erp.entity.BasePo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@ApiModel("物流商表")
@Entity
@Table(name = "t_transport")
@Data
public class TransportPo extends BasePo implements Serializable {

    @ApiModelProperty("物流商id")
    @Id
    @Column(name = "transport_id")
    private Long transportId;

    @ApiModelProperty("供应商名称")
    @Column(name = "supplier_name")
    private String supplierName;

    @ApiModelProperty("联系人姓名")
    @Column(name = "contact_name")
    private String contactName;

    @ApiModelProperty("联系人电话")
    @Column(name = "contact_num")
    private String contactNum;

    @ApiModelProperty("银行名称")
    @Column(name = "bank_name")
    private String bankName;

    @ApiModelProperty("银行账号")
    @Column(name = "bank_account_num")
    private String bankAccountNum;

    @ApiModelProperty("银行注册地址行号")
    @Column(name = "bank_location_num")
    private String bankLocationNum;

    @ApiModelProperty("公司注册地址")
    @Column(name = "registerd_addr")
    private String registeredAddr;

    @ApiModelProperty("公司真实联系地址")
    @Column(name = "real_addr")
    private String realAddr;

    @ApiModelProperty("纳税人识别号")
    @Column(name = "tax_num")
    private String taxNum;

    @ApiModelProperty("联系邮箱")
    @Column(name = "email")
    private String email;

}
