package com.kdwz.erp.api;

import com.kdwz.erp.config.Page;
import com.kdwz.erp.entity.common.BatchResults;
import com.kdwz.erp.entity.customer.CustomerCreateVo;
import com.kdwz.erp.entity.customer.CustomerSearchVo;
import com.kdwz.erp.entity.customer.CustomerUpdateVo;
import com.kdwz.erp.entity.customer.CustomerVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.util.List;


/**
 * 客户api
 */
@Api(tags = "客户api")
@RequestMapping(value = "/v2")
public interface CustomerApi {

    @ApiOperation("创建客户, 归属于当前用户")
    @RequestMapping(value = "/customers", method = RequestMethod.POST)
    CustomerVo create(@ApiParam("创建客户实体") @Valid @RequestBody CustomerCreateVo customerCreateVo);

    @ApiOperation("根据条件查询某一个客户")
    @RequestMapping(value = "/customers/actions/search", method = RequestMethod.POST)
    Page.PageResult<CustomerVo> search(@ApiParam("查询客户实体") @RequestBody CustomerSearchVo customerSearchVo);

    @ApiOperation("根据id查询某一客户")
    @RequestMapping(value = "/customers/{customer_id}", method = RequestMethod.GET)
    CustomerVo searchById(@ApiParam("客户id") @PathVariable("customer_id") Long customerId);

    @ApiOperation("根据客户名称模糊查询")
    @RequestMapping(value = "/customers/actions/fuzzy_search", method = RequestMethod.GET)
    List<CustomerVo> fuzzySearch(@ApiParam("客户名称") @RequestParam("customer_name") String customerName);

    @ApiOperation("分页获取当前用户的所有客户")
    @RequestMapping(value = "/customers/actions/query", method = RequestMethod.POST)
    Page.PageResult<CustomerVo> query(@RequestParam("offset") Integer offset, @RequestParam("limit") Integer limit);

    @ApiOperation("修改客户信息")
    @RequestMapping(value = "/customers/{customer_id}/actions/update", method = RequestMethod.PUT)
    CustomerVo update(@ApiParam("更新客户实体") @RequestBody CustomerUpdateVo customerUpdateVo,
                      @ApiParam("客户id") @PathVariable("customer_id") Long customerId);

    @ApiOperation("根据id删除客户")
    @RequestMapping(value = "/customers/{customer_id}", method = RequestMethod.DELETE)
    void deleteOne(@ApiParam("客户id") @PathVariable("customer_id") Long customerId);

    @ApiOperation("批量删除客户")
    @RequestMapping(value = "/customers/actions/delete", method = RequestMethod.POST)
    BatchResults delete(@ApiParam("多个客户id") @RequestBody List<Long> customerIds);

    @ApiOperation("导出客户")
    @RequestMapping(value = "/customers/actions/export", method = RequestMethod.POST)
    void export(@ApiParam("是否全部导出") @RequestParam("is_all") Boolean isAll,
                @ApiParam("需要导出客户id列表") @RequestBody List<Long> customerIds,
                HttpServletResponse response);

}
