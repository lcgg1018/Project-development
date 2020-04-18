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
 * @since 2020-04-18 16:52:55
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
    
    @RequestMapping("selectAll")
    public List<PurchaseDetail> selectAll(){
           return this.purchaseDetailService.selectAll();
    }

}