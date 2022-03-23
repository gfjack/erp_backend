package com.kdwz.erp.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum CompanyType {

    /**
     * 客户
     */
    CUSTOMER(0, "客户"),

    /**
     * 供应商
     */
    SUPPLIER(1, "供应商"),

    /**
     * 物流公司
     */
    TRANSPORT(2, "物流");

    /**
     * 公司代码
     */
    private final Integer companyCode;

    /**
     * 公司类型
     */
    private final String companyType;

}
