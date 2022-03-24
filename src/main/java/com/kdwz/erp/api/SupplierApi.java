package com.kdwz.erp.api;

import com.kdwz.erp.config.Page;
import com.kdwz.erp.entity.common.BatchResults;
import com.kdwz.erp.entity.supplier.SupplierCreateVo;
import com.kdwz.erp.entity.supplier.SupplierSearchVo;
import com.kdwz.erp.entity.supplier.SupplierUpdateVo;
import com.kdwz.erp.entity.supplier.SupplierVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.util.List;

@Api("供应商接口")
@RequestMapping("/v2")
public interface SupplierApi {

    @ApiOperation("创建供应商")
    @RequestMapping(value = "/suppliers", method = RequestMethod.POST)
    SupplierVo create(@ApiParam("供应商创建实体") @Valid @RequestBody SupplierCreateVo supplierCreateVo);

    @ApiOperation("根据条件搜索供应商")
    @RequestMapping(value = "/suppliers/actions/search", method = RequestMethod.POST)
    SupplierVo search(@ApiParam("查询供应商实体") @RequestBody SupplierSearchVo supplierSearchVo);

    @ApiOperation("根据id查询某一供应商")
    @RequestMapping(value = "/suppliers/{supplier_id}", method = RequestMethod.GET)
    SupplierVo searchById(@ApiParam("供应商id") @PathVariable("supplier_id") Long supplierId);

    @ApiOperation("根据供应商名称模糊查询")
    @RequestMapping(value = "/suppliers/actions/fuzzy_search", method = RequestMethod.GET)
    List<SupplierVo> fuzzySearch(@ApiParam("供应商名称") @RequestParam("supplier_name") String supplierName);

    @ApiOperation("分页获取供应商")
    @RequestMapping(value = "/suppliers/actions/query", method = RequestMethod.POST)
    Page.PageResult<SupplierVo> query(@ApiParam("offset") @RequestParam("offset") Integer offset,
                                      @ApiParam("limit") @RequestParam("limit") Integer limit);

    @ApiOperation("修改供应商信息")
    @RequestMapping(value = "/suppliers/{supplier_id}/actions/update", method = RequestMethod.PUT)
    SupplierVo update(@ApiParam("更新供应商实体") @RequestBody SupplierUpdateVo supplierUpdateVo,
                      @ApiParam("客户id") @PathVariable("supplier_id") Long supplierId);

    @ApiOperation("根据id删除供应商")
    @RequestMapping(value = "/suppliers/{supplier_id}", method = RequestMethod.DELETE)
    void deleteOne(@ApiParam("供应商id") @PathVariable("supplier_id") Long supplierId);

    @ApiOperation("批量删除供应商")
    @RequestMapping(value = "/suppliers/actions/delete", method = RequestMethod.POST)
    BatchResults delete(@ApiParam("多个供应商id") @RequestBody List<Long> supplierIds);

    @ApiOperation("导出供应商")
    @RequestMapping(value = "/suppliers/actions/export", method = RequestMethod.POST)
    void export(@ApiParam("是否需要全部导出") @RequestParam("is_all") Boolean isAll,
                @ApiParam("需要导出的供应商id列表") @RequestBody List<Long> supplierIds,
                HttpServletResponse response);

}
