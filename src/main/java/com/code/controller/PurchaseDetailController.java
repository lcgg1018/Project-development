package com.code.controller;

import com.code.entity.PurchaseDetail;
import com.code.service.PurchaseDetailService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import javax.annotation.Resource;

/**
 * (PurchaseDetail)表控制层
 *
 * @author yap
 * @since 2020-04-19 02:16:40
 */
@RestController
@RequestMapping("purchaseDetail")
public class PurchaseDetailController {
    /**
     * 服务对象
     */
    @Resource
    private PurchaseDetailService purchaseDetailService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public PurchaseDetail selectOne(Integer id) {
        return this.purchaseDetailService.queryById(id);
    }
    
    
        /**
     * 查询某张表所有数据，搭配PageHelper使用更佳！
     *
     * @param
     * @return 对象列表
     */
    @RequestMapping("selectAll")
    public List<PurchaseDetail> selectAll(){
           return this.purchaseDetailService.selectAll();
    }
    
    
        /**
     * 通过实体作为筛选条件查询
     *
     * @param purchaseDetail 实例对象
     * @return 对象列表
     */
    @RequestMapping("queryAll")
    public List<PurchaseDetail>  queryAll(PurchaseDetail purchaseDetail){
           return this.purchaseDetailService.queryAll(purchaseDetail);
    }

}