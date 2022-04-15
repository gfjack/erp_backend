package com.kdwz.erp.api;

import com.kdwz.erp.entity.common.BatchResults;
import com.kdwz.erp.entity.order.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Api(tags = "订单api")
@RequestMapping("/v2")
public interface OrderApi {

    @ApiOperation("创建新订单")
    @RequestMapping(value = "/orders", method = RequestMethod.POST)
    OrderVo create(@ApiParam("订单创建实体") @Valid @RequestBody OrderCreateVo orderCreateVo);

    @ApiOperation("根据订单编号查询订单")
    @RequestMapping(value = "/orders/{order_num}", method = RequestMethod.GET)
    OrderResultsVo searchByOrderNum(@ApiParam("订单编号") @PathVariable("order_num") String orderNum);

    @ApiOperation("根据多个订单编号查询订单")
    @RequestMapping(value = "/orders/actions/search_order_nums", method = RequestMethod.POST)
    OrderResultsVo searchByOrderNums(@ApiParam("是否为所有订单") @RequestParam("is_all") Boolean isAll,
                                     @ApiParam("订单编号列表") @RequestBody List<String> orderNums);

    @ApiOperation("根据条件查询订单")
    @RequestMapping(value = "/orders/actions/search", method = RequestMethod.POST)
    OrderResultsVo search(@ApiParam("搜索订单实体") @RequestBody OrderSearchVo orderSearchVo);

    @ApiOperation("分页获取当前用户的所有订单")
    @RequestMapping(value = "/orders/actions/query", method = RequestMethod.POST)
    OrderResultsVo query(@ApiParam("offset") @RequestParam("offset") Integer offset,
                         @ApiParam("limit") @RequestParam("limit") Integer limit);

    @ApiOperation("修改订单信息")
    @RequestMapping(value = "/orders/{order_num}/actions/update" ,method = RequestMethod.PUT)
    OrderResultsVo update(@ApiParam("订单更新实体") @RequestBody OrderUpdateVo orderUpdateVo);

    @ApiOperation("根据订单编号删除一个订单, 会删除相应的订单细节")
    @RequestMapping(value = "/orders/{order_num}", method = RequestMethod.DELETE)
    void deleteOne(@ApiParam("订单编号") @PathVariable("order_num") String orderNum);

    @ApiOperation("批量删除订单")
    @RequestMapping(value = "/orders/actions/delete", method = RequestMethod.POST)
    BatchResults delete(@ApiParam("订单编号列表") @RequestBody List<String> orderNums);

    @ApiOperation("导出订单")
    @RequestMapping(value = "/orders/actions/export", method = RequestMethod.POST)
    void export(@ApiParam("是否导出全部") @RequestParam("is_all") Boolean isAll,
                @ApiParam("需要导出的订单编号列表") @RequestBody List<String> orderNums);

    @ApiOperation("更新所有数据")
    @RequestMapping(value = "/orders/actions/reload", method = RequestMethod.PUT)
    Boolean reload();

}
