package com.kdwz.erp.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum CompanyType {

    CUSTOMER(0, "客户"),
    SUPPLIER(1, "供应商"),
    TRANSPORT(2, "运输");

    private Integer companyCode;

    private String companyType;

}
