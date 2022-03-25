package com.kdwz.erp.api;

import com.kdwz.erp.config.Page;
import com.kdwz.erp.entity.common.BatchResults;
import com.kdwz.erp.entity.transport.TransportCreateVo;
import com.kdwz.erp.entity.transport.TransportSearchVo;
import com.kdwz.erp.entity.transport.TransportUpdateVo;
import com.kdwz.erp.entity.transport.TransportVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Api("物流api")
@RequestMapping("/v2")
public interface TransportApi {

    @ApiOperation("创建物流商")
    @RequestMapping(value = "/transports", method = RequestMethod.POST)
    TransportVo create(@ApiParam("物流公司创建实体") @Valid @RequestBody TransportCreateVo transportCreateVo);

    @ApiOperation("根据条件搜索物流商")
    @RequestMapping(value = "/transports/actions/search", method = RequestMethod.POST)
    Page.PageResult<TransportVo> search(@ApiParam("查询物流商实体") @RequestBody TransportSearchVo transportSearchVo);

    @ApiOperation("根据id查询某一物流商")
    @RequestMapping(value = "/transports/{transport_id}", method = RequestMethod.GET)
    TransportVo searchById(@ApiParam("物流商id") @PathVariable("transport_id") Long transportId);

    @ApiOperation("根据物流商名称模糊查询")
    @RequestMapping(value = "/transports/actions/fuzzy_search", method = RequestMethod.GET)
    List<TransportVo> fuzzySearch(@ApiParam("物流商名称") @RequestParam("transport_name") String transportName);

    @ApiOperation("分页获取物流商")
    @RequestMapping(value = "/transports/actions/query", method = RequestMethod.POST)
    Page.PageResult<TransportVo> query(@ApiParam("offset") @RequestParam("offset") Integer offset,
                                       @ApiParam("limit") @RequestParam("limit") Integer limit);

    @ApiOperation("修改物流商信息")
    @RequestMapping(value = "/transports/{transport_id}/actions/update", method = RequestMethod.PUT)
    TransportVo update(@ApiParam("更新物流商实体") @RequestBody TransportUpdateVo transportUpdateVo,
                       @ApiParam("物流商id") @PathVariable("transport_id") Long transportId);

    @ApiOperation("根据id删除物流商")
    @RequestMapping(value = "/transports/{transport_id}", method = RequestMethod.DELETE)
    void deleteOne(@ApiParam("物流商id") @PathVariable("transport_id") Long transportId);

    @ApiOperation("批量删除物流商")
    @RequestMapping(value = "/transports/actions/delete", method = RequestMethod.POST)
    BatchResults delete(@ApiParam("多个物流商id") @RequestBody List<Long> transportIds);

    @ApiOperation("导出物流商")
    @RequestMapping(value = "/transports/actions/export", method = RequestMethod.POST)
    void export(@ApiParam("是否需要全部导出") @RequestParam("is_all") Boolean isAll,
                @ApiParam("需要导出的物流商id列表") @RequestBody List<Long> transportIds);

}
