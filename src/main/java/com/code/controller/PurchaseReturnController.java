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
 * @since 2020-04-18 16:52:56
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
    
    @RequestMapping("selectAll")
    public List<PurchaseReturn> selectAll(){
           return this.purchaseReturnService.selectAll();
    }

}