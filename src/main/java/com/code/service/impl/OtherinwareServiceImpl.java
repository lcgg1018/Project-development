package com.code.service.impl;

import com.code.entity.Otherinware;
import com.code.dao.OtherinwareDao;
import com.code.service.OtherinwareService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Otherinware)表服务实现类
 *
 * @author yap
 * @since 2020-04-19 02:16:42
 */
@Service("otherinwareService")
public class OtherinwareServiceImpl implements OtherinwareService {
    @Resource
    private OtherinwareDao otherinwareDao;

    /**
     * 通过ID查询单条数据
     *
     * @param otherinwareid 主键
     * @return 实例对象
     */
    @Override
    public Otherinware queryById(Integer otherinwareid) {
        return this.otherinwareDao.queryById(otherinwareid);
    }

    /**
     * 查询多条数据
     *
     * @param 
     * @param 
     * @return 对象列表
     */
    @Override
    public List<Otherinware> selectAll(){
        return this.otherinwareDao.selectAll();
    }

    /**
     * 通过实体作为筛选条件查询
     *
     * @param otherinware 实例对象
     * @return 对象列表
     */
    @Override
   public List<Otherinware> queryAll(Otherinware otherinware){
          return  this.otherinwareDao.queryAll(otherinware);
    }

    /**
     * 新增数据
     *
     * @param otherinware 实例对象
     * @return 实例对象
     */
    @Override
    public Otherinware insert(Otherinware otherinware) {
        this.otherinwareDao.insert(otherinware);
        return otherinware;
    }

    /**
     * 修改数据
     *
     * @param otherinware 实例对象
     * @return 实例对象
     */
    @Override
    public Otherinware update(Otherinware otherinware) {
        this.otherinwareDao.update(otherinware);
        return this.queryById(otherinware.getOtherinwareid());
    }

    /**
     * 通过主键删除数据
     *
     * @param otherinwareid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer otherinwareid) {
        return this.otherinwareDao.deleteById(otherinwareid) > 0;
    }
}