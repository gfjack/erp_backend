package com.kdwz.erp.api;

import com.kdwz.erp.constant.CompanyType;
import com.kdwz.erp.entity.invoice.InvoiceResultsVo;
import com.kdwz.erp.entity.invoice.InvoiceSearchVo;
import com.kdwz.erp.entity.invoice.InvoiceUpdateVo;
import com.kdwz.erp.entity.invoice.InvoiceVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api("发票api")
@RequestMapping("/v2")
public interface InvoiceApi {

    @ApiOperation("分页查询用户所拥有的发票 管理员查询所有")
    @RequestMapping(value = "/invoices/actions/query", method = RequestMethod.POST)
    InvoiceResultsVo query(@ApiParam("offset") @RequestParam("offset")Integer offset,
                           @ApiParam("limit") @RequestParam("limit") Integer limit,
                           @ApiParam("invoice_type") @RequestParam("invoice_type") CompanyType invoiceType);

    @ApiOperation("根据条件查询发票 模糊查询")
    @RequestMapping(value = "/invoices/actions/search", method = RequestMethod.POST)
    InvoiceResultsVo search(@ApiParam("发票搜索实体") @RequestBody InvoiceSearchVo invoiceSearchVo);

    @ApiOperation("更新发票")
    @RequestMapping(value = "/invoices/{invoice_id}/actions/update", method = RequestMethod.PUT)
    InvoiceVo update(@ApiParam("发票id") @PathVariable("invoice_id") Long invoiceId,
                     @ApiParam("发票更新实体") @RequestBody InvoiceUpdateVo invoiceUpdateVo);

    @ApiOperation("根据发票id删除发票")
    @RequestMapping(value = "/invoices/{invoice_id}", method = RequestMethod.DELETE)
    void deleteOne(@ApiParam("发票id") @PathVariable("invoice_id") Long invoiceId);

    @ApiOperation("导出发票")
    @RequestMapping(value = "/invoices/actions/export", method = RequestMethod.POST)
    void export(@ApiParam("是否全部导出") @RequestParam("is_all") Boolean isAll,
                @ApiParam("需要导出的发票id列表") @RequestBody List<Long> invoiceIds);

}
