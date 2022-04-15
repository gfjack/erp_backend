package com.kdwz.erp.api;

import com.kdwz.erp.config.Page;
import com.kdwz.erp.entity.profit.ProfitResultsVo;
import com.kdwz.erp.entity.profit.ProfitSearchVo;
import com.kdwz.erp.entity.profit.ProfitVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Api(tags = "利润api")
@RequestMapping("/v2")
public interface ProfitApi {

    @ApiOperation("分页查询利润数据")
    @RequestMapping(value = "/profits/actions/query", method = RequestMethod.POST)
    ProfitResultsVo query(@ApiParam("offset") @RequestParam("offset") Integer offset,
                          @ApiParam("limit") @RequestParam("limit") Integer limit);

    @ApiOperation("条件查询利润数据 模糊查询")
    @RequestMapping(value = "/profits/actions/search", method = RequestMethod.POST)
    ProfitResultsVo search(@ApiParam("利润搜索实体") @RequestBody ProfitSearchVo profitSearchVo);

    @ApiOperation("导出利润数据")
    @RequestMapping(value = "/profits/actions/export", method = RequestMethod.POST)
    void export(@ApiParam("是否导出所有") @RequestParam("is_all") Boolean isAll,
                @ApiParam("需要导出的利润订单编号列表") @RequestBody List<String> orderNums);

}
