package com.code.service.impl;

import com.code.entity.Relatedsaleandorder;
import com.code.dao.RelatedsaleandorderDao;
import com.code.service.RelatedsaleandorderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Relatedsaleandorder)表服务实现类
 *
 * @author yap
 * @since 2020-04-18 23:26:00
 */
@Service("relatedsaleandorderService")
public class RelatedsaleandorderServiceImpl implements RelatedsaleandorderService {
    @Resource
    private RelatedsaleandorderDao relatedsaleandorderDao;

    /**
     * 通过ID查询单条数据
     *
     * @param  主键
     * @return 实例对象
     */
    @Override
    public Relatedsaleandorder queryById( ) {
        return this.relatedsaleandorderDao.queryById();
    }

    /**
     * 查询多条数据
     *
     * @param 
     * @param 
     * @return 对象列表
     */
    @Override
    public List<Relatedsaleandorder> selectAll(){
        return this.relatedsaleandorderDao.selectAll();
    }

    /**
     * 新增数据
     *
     * @param relatedsaleandorder 实例对象
     * @return 实例对象
     */
    @Override
    public Relatedsaleandorder insert(Relatedsaleandorder relatedsaleandorder) {
        this.relatedsaleandorderDao.insert(relatedsaleandorder);
        return relatedsaleandorder;
    }

    /**
     * 修改数据
     *
     * @param relatedsaleandorder 实例对象
     * @return 实例对象
     */
    @Override
    public Relatedsaleandorder update(Relatedsaleandorder relatedsaleandorder) {
        this.relatedsaleandorderDao.update(relatedsaleandorder);
        return this.queryById(relatedsaleandorder.get());
    }

    /**
     * 通过主键删除数据
     *
     * @param  主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById( ) {
        return this.relatedsaleandorderDao.deleteById() > 0;
    }
}