package com.code.service.impl;

import com.code.entity.Suppliertype;
import com.code.dao.SuppliertypeDao;
import com.code.service.SuppliertypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Suppliertype)表服务实现类
 *
 * @author yap
 * @since 2020-04-18 16:52:56
 */
@Service("suppliertypeService")
public class SuppliertypeServiceImpl implements SuppliertypeService {
    @Resource
    private SuppliertypeDao suppliertypeDao;

    /**
     * 通过ID查询单条数据
     *
     * @param stypeid 主键
     * @return 实例对象
     */
    @Override
    public Suppliertype queryById(Integer stypeid) {
        return this.suppliertypeDao.queryById(stypeid);
    }

    /**
     * 查询多条数据
     *
     * @param 
     * @param 
     * @return 对象列表
     */
    @Override
    public List<Suppliertype> selectAll(){
        return this.suppliertypeDao.selectAll();
    }

    /**
     * 新增数据
     *
     * @param suppliertype 实例对象
     * @return 实例对象
     */
    @Override
    public Suppliertype insert(Suppliertype suppliertype) {
        this.suppliertypeDao.insert(suppliertype);
        return suppliertype;
    }

    /**
     * 修改数据
     *
     * @param suppliertype 实例对象
     * @return 实例对象
     */
    @Override
    public Suppliertype update(Suppliertype suppliertype) {
        this.suppliertypeDao.update(suppliertype);
        return this.queryById(suppliertype.getStypeid());
    }

    /**
     * 通过主键删除数据
     *
     * @param stypeid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer stypeid) {
        return this.suppliertypeDao.deleteById(stypeid) > 0;
    }
}