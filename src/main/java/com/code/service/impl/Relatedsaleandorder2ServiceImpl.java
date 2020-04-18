package com.code.service.impl;

import com.code.entity.Relatedsaleandorder2;
import com.code.dao.Relatedsaleandorder2Dao;
import com.code.service.Relatedsaleandorder2Service;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Relatedsaleandorder2)表服务实现类
 *
 * @author yap
 * @since 2020-04-18 23:26:31
 */
@Service("relatedsaleandorder2Service")
public class Relatedsaleandorder2ServiceImpl implements Relatedsaleandorder2Service {
    @Resource
    private Relatedsaleandorder2Dao relatedsaleandorder2Dao;

    /**
     * 通过ID查询单条数据
     *
     * @param rid 主键
     * @return 实例对象
     */
    @Override
    public Relatedsaleandorder2 queryById(Integer rid) {
        return this.relatedsaleandorder2Dao.queryById(rid);
    }

    /**
     * 查询多条数据
     *
     * @param 
     * @param 
     * @return 对象列表
     */
    @Override
    public List<Relatedsaleandorder2> selectAll(){
        return this.relatedsaleandorder2Dao.selectAll();
    }

    /**
     * 新增数据
     *
     * @param relatedsaleandorder2 实例对象
     * @return 实例对象
     */
    @Override
    public Relatedsaleandorder2 insert(Relatedsaleandorder2 relatedsaleandorder2) {
        this.relatedsaleandorder2Dao.insert(relatedsaleandorder2);
        return relatedsaleandorder2;
    }

    /**
     * 修改数据
     *
     * @param relatedsaleandorder2 实例对象
     * @return 实例对象
     */
    @Override
    public Relatedsaleandorder2 update(Relatedsaleandorder2 relatedsaleandorder2) {
        this.relatedsaleandorder2Dao.update(relatedsaleandorder2);
        return this.queryById(relatedsaleandorder2.getRid());
    }

    /**
     * 通过主键删除数据
     *
     * @param rid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer rid) {
        return this.relatedsaleandorder2Dao.deleteById(rid) > 0;
    }
}