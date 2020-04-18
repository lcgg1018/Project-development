package com.code.controller;

import com.code.entity.PurchaseReturn;
import com.code.service.PurchaseReturnService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import javax.annotation.Resource;

/**
 * (PurchaseReturn)表控制层
 *
 * @author yap
 * @since 2020-04-19 02:16:39
 */
@RestController
@RequestMapping("purchaseReturn")
public class PurchaseReturnController {
    /**
     * 服务对象
     */
    @Resource
    private PurchaseReturnService purchaseReturnService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public PurchaseReturn selectOne(Integer id) {
        return this.purchaseReturnService.queryById(id);
    }
    
    
        /**
     * 查询某张表所有数据，搭配PageHelper使用更佳！
     *
     * @param
     * @return 对象列表
     */
    @RequestMapping("selectAll")
    public List<PurchaseReturn> selectAll(){
           return this.purchaseReturnService.selectAll();
    }
    
    
        /**
     * 通过实体作为筛选条件查询
     *
     * @param purchaseReturn 实例对象
     * @return 对象列表
     */
    @RequestMapping("queryAll")
    public List<PurchaseReturn>  queryAll(PurchaseReturn purchaseReturn){
           return this.purchaseReturnService.queryAll(purchaseReturn);
    }

}