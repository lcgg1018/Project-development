package com.code.service.impl;

import com.code.entity.PurchaseReturn;
import com.code.dao.PurchaseReturnDao;
import com.code.service.PurchaseReturnService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (PurchaseReturn)表服务实现类
 *
 * @author yap
 * @since 2020-04-18 16:52:56
 */
@Service("purchaseReturnService")
public class PurchaseReturnServiceImpl implements PurchaseReturnService {
    @Resource
    private PurchaseReturnDao purchaseReturnDao;

    /**
     * 通过ID查询单条数据
     *
     * @param purchaseId 主键
     * @return 实例对象
     */
    @Override
    public PurchaseReturn queryById(Integer purchaseId) {
        return this.purchaseReturnDao.queryById(purchaseId);
    }

    /**
     * 查询多条数据
     *
     * @param 
     * @param 
     * @return 对象列表
     */
    @Override
    public List<PurchaseReturn> selectAll(){
        return this.purchaseReturnDao.selectAll();
    }

    /**
     * 新增数据
     *
     * @param purchaseReturn 实例对象
     * @return 实例对象
     */
    @Override
    public PurchaseReturn insert(PurchaseReturn purchaseReturn) {
        this.purchaseReturnDao.insert(purchaseReturn);
        return purchaseReturn;
    }

    /**
     * 修改数据
     *
     * @param purchaseReturn 实例对象
     * @return 实例对象
     */
    @Override
    public PurchaseReturn update(PurchaseReturn purchaseReturn) {
        this.purchaseReturnDao.update(purchaseReturn);
        return this.queryById(purchaseReturn.getPurchaseId());
    }

    /**
     * 通过主键删除数据
     *
     * @param purchaseId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer purchaseId) {
        return this.purchaseReturnDao.deleteById(purchaseId) > 0;
    }
}