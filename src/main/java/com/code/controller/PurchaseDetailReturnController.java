package com.code.controller;

import com.code.entity.PurchaseDetailReturn;
import com.code.service.PurchaseDetailReturnService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import javax.annotation.Resource;

/**
 * (PurchaseDetailReturn)表控制层
 *
 * @author yap
 * @since 2020-04-18 16:52:56
 */
@RestController
@RequestMapping("purchaseDetailReturn")
public class PurchaseDetailReturnController {
    /**
     * 服务对象
     */
    @Resource
    private PurchaseDetailReturnService purchaseDetailReturnService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public PurchaseDetailReturn selectOne(Integer id) {
        return this.purchaseDetailReturnService.queryById(id);
    }
    
    @RequestMapping("selectAll")
    public List<PurchaseDetailReturn> selectAll(){
           return this.purchaseDetailReturnService.selectAll();
    }

}