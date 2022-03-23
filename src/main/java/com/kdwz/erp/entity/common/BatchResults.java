package com.kdwz.erp.entity.common;

import io.swagger.annotations.ApiModel;
import lombok.Data;

@ApiModel("批量处理结果")
@Data
public class BatchResults {

    private BatchSuccessResult successResult;

    private BatchFailedResult failedResult;

}
