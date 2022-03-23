package com.kdwz.erp.entity.common;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.util.Map;

@ApiModel("批量成功结果")
@Data
public class BatchSuccessResult {

    private Map<String, String> succeedItems;

    private Integer count;

}
