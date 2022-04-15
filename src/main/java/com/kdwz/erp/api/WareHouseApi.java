package com.kdwz.erp.api;

import com.kdwz.erp.config.Page;
import com.kdwz.erp.entity.common.BatchResults;
import com.kdwz.erp.entity.warehouse.GoodCreateVo;
import com.kdwz.erp.entity.warehouse.GoodSearchVo;
import com.kdwz.erp.entity.warehouse.GoodUpdateVo;
import com.kdwz.erp.entity.warehouse.GoodVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Api(tags = "仓库api")
@RequestMapping("/v2")
public interface WareHouseApi {

    @ApiOperation("创建仓库商品")
    @RequestMapping(value = "/goods", method = RequestMethod.POST)
    GoodVo create(@ApiParam("创建商品实体") @Valid @RequestBody GoodCreateVo goodCreateVo);

    @ApiOperation("查询商品")
    @RequestMapping(value = "/goods/actions/query", method = RequestMethod.POST)
    Page.PageResult<GoodVo> query(@ApiParam("offset") @RequestParam("offset") Integer offset,
                                  @ApiParam("limit") @RequestParam("limit") Integer limit,
                                  @ApiParam("查询商品实体") @RequestBody GoodSearchVo goodSearchVo);

    @ApiOperation("更新商品")
    @RequestMapping(value = "/goods/{good_id}/actions/update", method = RequestMethod.PUT)
    GoodVo update(@ApiParam("更新商品实体") @RequestBody GoodUpdateVo goodUpdateVo,
                  @ApiParam("商品id") @PathVariable("good_id") Long goodId);

    @ApiOperation("根据id删除商品")
    @RequestMapping(value = "/goods/{good_id}", method = RequestMethod.DELETE)
    void deleteOne(@ApiParam("商品id") @PathVariable("good_id") Long goodId);

    @ApiOperation("批量删除商品")
    @RequestMapping(value = "/goods/actions/delete", method = RequestMethod.POST)
    BatchResults delete(@ApiParam("删除商品id列表") @RequestBody List<Long> goodIds);

    @ApiOperation("导出商品")
    @RequestMapping(value = "/goods/actions/export", method = RequestMethod.POST)
    void export(@ApiParam("是否导出所有") @RequestParam("is_all") Boolean isAll,
                @ApiParam("需要导出的商品id列表") @RequestBody List<Long> goodIds);

}
