package com.code.service.impl;

import com.code.entity.Transfersorder;
import com.code.dao.TransfersorderDao;
import com.code.service.TransfersorderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Transfersorder)表服务实现类
 *
 * @author yap
 * @since 2020-04-19 02:16:40
 */
@Service("transfersorderService")
public class TransfersorderServiceImpl implements TransfersorderService {
    @Resource
    private TransfersorderDao transfersorderDao;

    /**
     * 通过ID查询单条数据
     *
     * @param transfersorderid 主键
     * @return 实例对象
     */
    @Override
    public Transfersorder queryById(Integer transfersorderid) {
        return this.transfersorderDao.queryById(transfersorderid);
    }

    /**
     * 查询多条数据
     *
     * @param 
     * @param 
     * @return 对象列表
     */
    @Override
    public List<Transfersorder> selectAll(){
        return this.transfersorderDao.selectAll();
    }

    /**
     * 通过实体作为筛选条件查询
     *
     * @param transfersorder 实例对象
     * @return 对象列表
     */
    @Override
   public List<Transfersorder> queryAll(Transfersorder transfersorder){
          return  this.transfersorderDao.queryAll(transfersorder);
    }

    /**
     * 新增数据
     *
     * @param transfersorder 实例对象
     * @return 实例对象
     */
    @Override
    public Transfersorder insert(Transfersorder transfersorder) {
        this.transfersorderDao.insert(transfersorder);
        return transfersorder;
    }

    /**
     * 修改数据
     *
     * @param transfersorder 实例对象
     * @return 实例对象
     */
    @Override
    public Transfersorder update(Transfersorder transfersorder) {
        this.transfersorderDao.update(transfersorder);
        return this.queryById(transfersorder.getTransfersorderid());
    }

    /**
     * 通过主键删除数据
     *
     * @param transfersorderid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer transfersorderid) {
        return this.transfersorderDao.deleteById(transfersorderid) > 0;
    }
}