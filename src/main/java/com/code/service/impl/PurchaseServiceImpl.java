package com.code.service.impl;

import com.code.entity.Purchase;
import com.code.dao.PurchaseDao;
import com.code.service.PurchaseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Purchase)表服务实现类
 *
 * @author yap
 * @since 2020-04-18 16:52:55
 */
@Service("purchaseService")
public class PurchaseServiceImpl implements PurchaseService {
    @Resource
    private PurchaseDao purchaseDao;

    /**
     * 通过ID查询单条数据
     *
     * @param purchaseId 主键
     * @return 实例对象
     */
    @Override
    public Purchase queryById(Integer purchaseId) {
        return this.purchaseDao.queryById(purchaseId);
    }

    /**
     * 查询多条数据
     *
     * @param 
     * @param 
     * @return 对象列表
     */
    @Override
    public List<Purchase> selectAll(){
        return this.purchaseDao.selectAll();
    }

    /**
     * 新增数据
     *
     * @param purchase 实例对象
     * @return 实例对象
     */
    @Override
    public Purchase insert(Purchase purchase) {
        this.purchaseDao.insert(purchase);
        return purchase;
    }

    /**
     * 修改数据
     *
     * @param purchase 实例对象
     * @return 实例对象
     */
    @Override
    public Purchase update(Purchase purchase) {
        this.purchaseDao.update(purchase);
        return this.queryById(purchase.getPurchaseId());
    }

    /**
     * 通过主键删除数据
     *
     * @param purchaseId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer purchaseId) {
        return this.purchaseDao.deleteById(purchaseId) > 0;
    }
}