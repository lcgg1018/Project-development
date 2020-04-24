package com.code.service.impl;

import com.code.entity.PurchaseDetailReturn;
import com.code.dao.PurchaseDetailReturnDao;
import com.code.service.PurchaseDetailReturnService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (PurchaseDetailReturn)表服务实现类
 *
 * @author yap
 * @since 2020-04-19 02:16:39
 */
@Service("purchaseDetailReturnService")
public class PurchaseDetailReturnServiceImpl implements PurchaseDetailReturnService {
    @Resource
    private PurchaseDetailReturnDao purchaseDetailReturnDao;

    /**
     * 通过ID查询单条数据
     *
     * @param purchaseId 主键
     * @return 实例对象
     */
    @Override
    public PurchaseDetailReturn queryById(Integer purchaseId) {
        return this.purchaseDetailReturnDao.queryById(purchaseId);
    }

    /**
     * 查询多条数据
     *
     * @param 
     * @param 
     * @return 对象列表
     */
    @Override
    public List<PurchaseDetailReturn> selectAll(){
        return this.purchaseDetailReturnDao.selectAll();
    }

    /**
     * 通过实体作为筛选条件查询
     *
     * @param purchaseDetailReturn 实例对象
     * @return 对象列表
     */
    @Override
   public List<PurchaseDetailReturn> queryAll(PurchaseDetailReturn purchaseDetailReturn){
          return  this.purchaseDetailReturnDao.queryAll(purchaseDetailReturn);
    }

    /**
     * 新增数据
     *
     * @param purchaseDetailReturn 实例对象
     * @return 实例对象
     */
    @Override
    public PurchaseDetailReturn insert(PurchaseDetailReturn purchaseDetailReturn) {
        this.purchaseDetailReturnDao.insert(purchaseDetailReturn);
        return purchaseDetailReturn;
    }

    /**
     * 修改数据
     *
     * @param purchaseDetailReturn 实例对象
     * @return 实例对象
     */
    @Override
    public PurchaseDetailReturn update(PurchaseDetailReturn purchaseDetailReturn) {
        this.purchaseDetailReturnDao.update(purchaseDetailReturn);
        return this.queryById(purchaseDetailReturn.getPurchaseId());
    }

    /**
     * 通过主键删除数据
     *
     * @param purchaseId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer purchaseId) {
        return this.purchaseDetailReturnDao.deleteById(purchaseId) > 0;
    }
}