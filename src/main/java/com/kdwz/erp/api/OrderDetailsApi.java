package com.kdwz.erp.api;

import com.kdwz.erp.entity.orderDetails.OrderDetailsCreateVo;
import com.kdwz.erp.entity.orderDetails.OrderDetailsUpdateVo;
import com.kdwz.erp.entity.orderDetails.OrderDetailsVo;
import com.kdwz.erp.entity.orderDetails.OrderDetailsResultsVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "订单细节api")
@RequestMapping("/v2")
public interface OrderDetailsApi {

    @ApiOperation("创建订单细节")
    @RequestMapping(value = "/orders/{order_num}/order_details", method = RequestMethod.POST)
    OrderDetailsVo create(@ApiParam("订单编号") @PathVariable("order_num") String orderNum,
                          @ApiParam("创建订单细节实体") @RequestBody OrderDetailsCreateVo orderDetailsCreateVo);

    @ApiOperation("批量创建订单细节")
    @RequestMapping(value = "/orders/{order_num}/order_details/batch_create", method = RequestMethod.POST)
    OrderDetailsResultsVo create(@ApiParam("订单编号") @PathVariable("order_num") String orderNum,
                                 @ApiParam("创建订单实体列表") @RequestBody List<OrderDetailsCreateVo> orderDetailsCreateVos);

    @ApiOperation("根据订单编号查询订单细节")
    @RequestMapping(value = "/orders/{order_num}/order_details", method = RequestMethod.GET)
    OrderDetailsResultsVo searchByOrderNum(@ApiParam("订单编号") @PathVariable("order_num") String orderNum);

    @ApiOperation("更新某一个订单细节")
    @RequestMapping(value = "/orders/{order_num}/order_details/{order_detail_id}", method = RequestMethod.PUT)
    OrderDetailsResultsVo update(@ApiParam("订单编号") @PathVariable("order_num") String orderNum,
                                 @ApiParam("订单细节id") @PathVariable("order_detail_id") Long orderDetailId,
                                 @ApiParam("订单细节更新实体") @RequestBody OrderDetailsUpdateVo orderDetailsUpdateVo);

    @ApiOperation("删除某一个订单细节")
    @RequestMapping(value = "/orders/{order_num}/order_details/{order_detail_id}", method = RequestMethod.DELETE)
    void delete(@ApiParam("订单编号") @PathVariable("order_num") String orderNum,
                @ApiParam("订单细节id") @PathVariable("order_detail_id") Long orderDetailId);

    @ApiOperation("导出订单细节")
    @RequestMapping(value = "/orders/{order_num}/actions/export", method = RequestMethod.POST)
    void export(@ApiParam("是否导出全部") @RequestParam("is_all") Boolean isAll,
                @ApiParam("需要导出的订单细节id列表") @RequestBody List<Long> orderDetailIds);

}
