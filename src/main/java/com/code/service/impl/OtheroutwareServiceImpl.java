package com.code.service.impl;

import com.code.entity.Otheroutware;
import com.code.dao.OtheroutwareDao;
import com.code.service.OtheroutwareService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Otheroutware)表服务实现类
 *
 * @author yap
 * @since 2020-04-19 02:16:40
 */
@Service("otheroutwareService")
public class OtheroutwareServiceImpl implements OtheroutwareService {
    @Resource
    private OtheroutwareDao otheroutwareDao;

    /**
     * 通过ID查询单条数据
     *
     * @param otheroutwareid 主键
     * @return 实例对象
     */
    @Override
    public Otheroutware queryById(Integer otheroutwareid) {
        return this.otheroutwareDao.queryById(otheroutwareid);
    }

    /**
     * 查询多条数据
     *
     * @param 
     * @param 
     * @return 对象列表
     */
    @Override
    public List<Otheroutware> selectAll(){
        return this.otheroutwareDao.selectAll();
    }

    /**
     * 通过实体作为筛选条件查询
     *
     * @param otheroutware 实例对象
     * @return 对象列表
     */
    @Override
   public List<Otheroutware> queryAll(Otheroutware otheroutware){
          return  this.otheroutwareDao.queryAll(otheroutware);
    }

    /**
     * 新增数据
     *
     * @param otheroutware 实例对象
     * @return 实例对象
     */
    @Override
    public Otheroutware insert(Otheroutware otheroutware) {
        this.otheroutwareDao.insert(otheroutware);
        return otheroutware;
    }

    /**
     * 修改数据
     *
     * @param otheroutware 实例对象
     * @return 实例对象
     */
    @Override
    public Otheroutware update(Otheroutware otheroutware) {
        this.otheroutwareDao.update(otheroutware);
        return this.queryById(otheroutware.getOtheroutwareid());
    }

    /**
     * 通过主键删除数据
     *
     * @param otheroutwareid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer otheroutwareid) {
        return this.otheroutwareDao.deleteById(otheroutwareid) > 0;
    }
}