package com.kdwz.erp.entity.common;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.util.Map;

@ApiModel("批量失败结果")
@Data
public class BatchFailedResult {

    private Map<String, String> failedItems;

    private Integer count;

}
