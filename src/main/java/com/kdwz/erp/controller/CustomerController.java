package com.kdwz.erp.controller;

import com.kdwz.erp.api.CustomerApi;
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

@Api("客户api")
@RestController
@RequestMapping("/v2")
public class CustomerController implements CustomerApi {

    @Override
    @ApiOperation("创建客户, 归属于当前用户")
    @RequestMapping(value = "/customers", method = RequestMethod.POST)
    public CustomerVo create(@ApiParam("创建客户实体") @Valid @RequestBody CustomerCreateVo customerCreateVo) {
        return null;
    }

    @Override
    @ApiOperation("根据条件查询某一个客户")
    @RequestMapping(value = "/customers/actions/search", method = RequestMethod.POST)
    public Page.PageResult<CustomerVo> search(@ApiParam("查询客户实体") @RequestBody CustomerSearchVo customerSearchVo) {
        return null;
    }

    @Override
    @ApiOperation("根据id查询某一客户")
    @RequestMapping(value = "/customers/{customer_id}", method = RequestMethod.GET)
    public CustomerVo searchById(@ApiParam("客户id") @PathVariable("customer_id") Long customerId) {
        return null;
    }

    @Override
    @ApiOperation("根据客户名称模糊查询")
    @RequestMapping(value = "/customers/actions/fuzzy_search", method = RequestMethod.GET)
    public List<CustomerVo> fuzzySearch(@ApiParam("客户名称") @RequestParam("customer_name") String customerName) {
        return null;
    }

    @Override
    @ApiOperation("分页获取当前用户的所有客户")
    @RequestMapping(value = "/customers/actions/query", method = RequestMethod.POST)
    public Page.PageResult<CustomerVo> query(@RequestParam("offset") Integer offset, @RequestParam("limit") Integer limit) {
        return null;
    }

    @Override
    @ApiOperation("修改客户信息")
    @RequestMapping(value = "/customers/{customer_id}/actions/update", method = RequestMethod.PUT)
    public CustomerVo update(@ApiParam("更新客户实体") @RequestBody CustomerUpdateVo customerUpdateVo,
                      @ApiParam("客户id") @PathVariable("customer_id") Long customerId) {
        return null;
    }

    @Override
    @ApiOperation("根据id删除客户")
    @RequestMapping(value = "/customers/{customer_id}", method = RequestMethod.DELETE)
    public void deleteOne(@ApiParam("客户id") @PathVariable("customer_id") Long customerId) {

    }

    @Override
    @ApiOperation("批量删除客户")
    @RequestMapping(value = "/customers/actions/delete", method = RequestMethod.POST)
    public BatchResults delete(@ApiParam("多个客户id") @RequestBody List<Long> customerIds) {
        return null;
    }

    @Override
    @ApiOperation("导出客户")
    @RequestMapping(value = "/customers/batch/export", method = RequestMethod.POST)
    public void export(@ApiParam("是否全部导出") @RequestParam("is_all") Boolean isAll,
                @ApiParam("需要导出客户id列表") @RequestBody List<Long> customerIds,
                HttpServletResponse response) {

    }

}
