package com.code.controller;

import com.code.entity.Purchase;
import com.code.service.PurchaseService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import javax.annotation.Resource;

/**
 * (Purchase)表控制层
 *
 * @author yap
 * @since 2020-04-18 16:52:55
 */
@RestController
@RequestMapping("purchase")
public class PurchaseController {
    /**
     * 服务对象
     */
    @Resource
    private PurchaseService purchaseService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Purchase selectOne(Integer id) {
        return this.purchaseService.queryById(id);
    }
    
    @RequestMapping("selectAll")
    public List<Purchase> selectAll(){
           return this.purchaseService.selectAll();
    }

}