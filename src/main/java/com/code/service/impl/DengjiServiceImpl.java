package com.code.service.impl;

import com.code.entity.Dengji;
import com.code.dao.DengjiDao;
import com.code.service.DengjiService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Dengji)表服务实现类
 *
 * @author yap
 * @since 2020-04-19 02:16:39
 */
@Service("dengjiService")
public class DengjiServiceImpl implements DengjiService {
    @Resource
    private DengjiDao dengjiDao;

    /**
     * 通过ID查询单条数据
     *
     * @param djid 主键
     * @return 实例对象
     */
    @Override
    public Dengji queryById(Integer djid) {
        return this.dengjiDao.queryById(djid);
    }

    /**
     * 查询多条数据
     *
     * @param 
     * @param 
     * @return 对象列表
     */
    @Override
    public List<Dengji> selectAll(){
        return this.dengjiDao.selectAll();
    }

    /**
     * 通过实体作为筛选条件查询
     *
     * @param dengji 实例对象
     * @return 对象列表
     */
    @Override
   public List<Dengji> queryAll(Dengji dengji){
          return  this.dengjiDao.queryAll(dengji);
    }

    /**
     * 新增数据
     *
     * @param dengji 实例对象
     * @return 实例对象
     */
    @Override
    public Dengji insert(Dengji dengji) {
        this.dengjiDao.insert(dengji);
        return dengji;
    }

    /**
     * 修改数据
     *
     * @param dengji 实例对象
     * @return 实例对象
     */
    @Override
    public Dengji update(Dengji dengji) {
        this.dengjiDao.update(dengji);
        return this.queryById(dengji.getDjid());
    }

    /**
     * 通过主键删除数据
     *
     * @param djid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer djid) {
        return this.dengjiDao.deleteById(djid) > 0;
    }
}