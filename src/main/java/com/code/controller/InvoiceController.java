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
 * @since 2020-04-19 02:16:42
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
    public Invoice selectOne(Integer id) {
        return this.invoiceService.queryById(id);
    }
    
    
        /**
     * 查询某张表所有数据，搭配PageHelper使用更佳！
     *
     * @param
     * @return 对象列表
     */
    @RequestMapping("selectAll")
    public List<Invoice> selectAll(){
           return this.invoiceService.selectAll();
    }
    
    
        /**
     * 通过实体作为筛选条件查询
     *
     * @param invoice 实例对象
     * @return 对象列表
     */
    @RequestMapping("queryAll")
    public List<Invoice>  queryAll(Invoice invoice){
           return this.invoiceService.queryAll(invoice);
    }

}