package com.code.service.impl;

import com.code.entity.Invoice;
import com.code.dao.InvoiceDao;
import com.code.service.InvoiceService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Invoice)表服务实现类
 *
 * @author yap
 * @since 2020-04-18 23:12:43
 */
@Service("invoiceService")
public class InvoiceServiceImpl implements InvoiceService {
    @Resource
    private InvoiceDao invoiceDao;

    /**
     * 通过ID查询单条数据
     *
     * @param  主键
     * @return 实例对象
     */
    @Override
    public Invoice queryById( ) {
        return this.invoiceDao.queryById();
    }

    /**
     * 查询多条数据
     *
     * @param 
     * @param 
     * @return 对象列表
     */
    @Override
    public List<Invoice> selectAll(){
        return this.invoiceDao.selectAll();
    }

    /**
     * 新增数据
     *
     * @param invoice 实例对象
     * @return 实例对象
     */
    @Override
    public Invoice insert(Invoice invoice) {
        this.invoiceDao.insert(invoice);
        return invoice;
    }

    /**
     * 修改数据
     *
     * @param invoice 实例对象
     * @return 实例对象
     */
    @Override
    public Invoice update(Invoice invoice) {
        this.invoiceDao.update(invoice);
        return this.queryById(invoice.get());
    }

    /**
     * 通过主键删除数据
     *
     * @param  主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById( ) {
        return this.invoiceDao.deleteById() > 0;
    }
}