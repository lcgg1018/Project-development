package com.code.controller;

import com.code.entity.Invoice;
import com.code.service.InvoiceService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import javax.annotation.Resource;

/**
 * (Invoice)表控制层
 *
 * @author yap
 * @since 2020-04-18 23:12:43
 */
@RestController
@RequestMapping("invoice")
public class InvoiceController {
    /**
     * 服务对象
     */
    @Resource
    private InvoiceService invoiceService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Invoice selectOne( id) {
        return this.invoiceService.queryById(id);
    }
    
    @RequestMapping("selectAll")
    public List<Invoice> selectAll(){
           return this.invoiceService.selectAll();
    }

}