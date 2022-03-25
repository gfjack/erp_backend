package com.kdwz.erp.entity.invoice;

import com.kdwz.erp.constant.CompanyType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@ApiModel("发票搜索实体")
@Data
public class InvoiceSearchVo {

    @ApiModelProperty("开始时间")
    private Date startTime;

    @ApiModelProperty("结束时间")
    private Date endTime;

    @ApiModelProperty("单位名称")
    private String companyName;

    @ApiModelProperty("单位性质")
    private CompanyType companyType;

}
