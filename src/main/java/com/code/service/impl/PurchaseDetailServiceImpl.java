package com.code.service.impl;

import com.code.entity.PurchaseDetail;
import com.code.dao.PurchaseDetailDao;
import com.code.service.PurchaseDetailService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (PurchaseDetail)表服务实现类
 *
 * @author yap
 * @since 2020-04-19 02:16:40
 */
@Service("purchaseDetailService")
public class PurchaseDetailServiceImpl implements PurchaseDetailService {
    @Resource
    private PurchaseDetailDao purchaseDetailDao;

    /**
     * 通过ID查询单条数据
     *
     * @param purchaseId 主键
     * @return 实例对象
     */
    @Override
    public PurchaseDetail queryById(Integer purchaseId) {
        return this.purchaseDetailDao.queryById(purchaseId);
    }

    /**
     * 查询多条数据
     *
     * @param 
     * @param 
     * @return 对象列表
     */
    @Override
    public List<PurchaseDetail> selectAll(){
        return this.purchaseDetailDao.selectAll();
    }

    /**
     * 通过实体作为筛选条件查询
     *
     * @param purchaseDetail 实例对象
     * @return 对象列表
     */
    @Override
   public List<PurchaseDetail> queryAll(PurchaseDetail purchaseDetail){
          return  this.purchaseDetailDao.queryAll(purchaseDetail);
    }

    /**
     * 新增数据
     *
     * @param purchaseDetail 实例对象
     * @return 实例对象
     */
    @Override
    public PurchaseDetail insert(PurchaseDetail purchaseDetail) {
        this.purchaseDetailDao.insert(purchaseDetail);
        return purchaseDetail;
    }

    /**
     * 修改数据
     *
     * @param purchaseDetail 实例对象
     * @return 实例对象
     */
    @Override
    public PurchaseDetail update(PurchaseDetail purchaseDetail) {
        this.purchaseDetailDao.update(purchaseDetail);
        return this.queryById(purchaseDetail.getPurchaseId());
    }

    /**
     * 通过主键删除数据
     *
     * @param purchaseId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer purchaseId) {
        return this.purchaseDetailDao.deleteById(purchaseId) > 0;
    }
}