package com.code.service.impl;

import com.code.entity.Saleandorder2;
import com.code.dao.Saleandorder2Dao;
import com.code.service.Saleandorder2Service;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Saleandorder2)表服务实现类
 *
 * @author yap
 * @since 2020-04-19 02:16:39
 */
@Service("saleandorder2Service")
public class Saleandorder2ServiceImpl implements Saleandorder2Service {
    @Resource
    private Saleandorder2Dao saleandorder2Dao;

    /**
     * 通过ID查询单条数据
     *
     * @param sid 主键
     * @return 实例对象
     */
    @Override
    public Saleandorder2 queryById(Integer sid) {
        return this.saleandorder2Dao.queryById(sid);
    }

    /**
     * 查询多条数据
     *
     * @param 
     * @param 
     * @return 对象列表
     */
    @Override
    public List<Saleandorder2> selectAll(){
        return this.saleandorder2Dao.selectAll();
    }

    /**
     * 通过实体作为筛选条件查询
     *
     * @param saleandorder2 实例对象
     * @return 对象列表
     */
    @Override
   public List<Saleandorder2> queryAll(Saleandorder2 saleandorder2){
          return  this.saleandorder2Dao.queryAll(saleandorder2);
    }

    /**
     * 新增数据
     *
     * @param saleandorder2 实例对象
     * @return 实例对象
     */
    @Override
    public Saleandorder2 insert(Saleandorder2 saleandorder2) {
        this.saleandorder2Dao.insert(saleandorder2);
        return saleandorder2;
    }

    /**
     * 修改数据
     *
     * @param saleandorder2 实例对象
     * @return 实例对象
     */
    @Override
    public Saleandorder2 update(Saleandorder2 saleandorder2) {
        this.saleandorder2Dao.update(saleandorder2);
        return this.queryById(saleandorder2.getSid());
    }

    /**
     * 通过主键删除数据
     *
     * @param sid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer sid) {
        return this.saleandorder2Dao.deleteById(sid) > 0;
    }
}