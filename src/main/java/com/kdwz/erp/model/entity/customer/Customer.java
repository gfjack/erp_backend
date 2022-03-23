package com.kdwz.erp.model.entity.customer;

import com.kdwz.erp.model.entity.BasePo;
import com.vladmihalcea.hibernate.type.json.JsonStringType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@ApiModel("客户表")
@Entity
@Table(name = "t_customer")
@Data
@TypeDef(name = "json", typeClass = JsonStringType.class)
public class Customer extends BasePo {

    @ApiModelProperty("客户id")
    @Id
    @Column(name = "customer_id")
    private Long customerId;

    @ApiModelProperty("客户名称")
    @Column(name = "customer_name")
    private String customerName;

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

    @ApiModelProperty("归属")
    @Column(name = "belongs")
    @Type(type = "json")
    private List<String> belongs;

}
