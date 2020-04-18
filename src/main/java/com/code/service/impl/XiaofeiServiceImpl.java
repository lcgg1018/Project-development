package com.code.service.impl;

import com.code.entity.Xiaofei;
import com.code.dao.XiaofeiDao;
import com.code.service.XiaofeiService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 会员消费记录表(Xiaofei)表服务实现类
 *
 * @author yap
 * @since 2020-04-18 16:52:56
 */
@Service("xiaofeiService")
public class XiaofeiServiceImpl implements XiaofeiService {
    @Resource
    private XiaofeiDao xiaofeiDao;

    /**
     * 通过ID查询单条数据
     *
     * @param hykid 主键
     * @return 实例对象
     */
    @Override
    public Xiaofei queryById(String hykid) {
        return this.xiaofeiDao.queryById(hykid);
    }

    /**
     * 查询多条数据
     *
     * @param 
     * @param 
     * @return 对象列表
     */
    @Override
    public List<Xiaofei> selectAll(){
        return this.xiaofeiDao.selectAll();
    }

    /**
     * 新增数据
     *
     * @param xiaofei 实例对象
     * @return 实例对象
     */
    @Override
    public Xiaofei insert(Xiaofei xiaofei) {
        this.xiaofeiDao.insert(xiaofei);
        return xiaofei;
    }

    /**
     * 修改数据
     *
     * @param xiaofei 实例对象
     * @return 实例对象
     */
    @Override
    public Xiaofei update(Xiaofei xiaofei) {
        this.xiaofeiDao.update(xiaofei);
        return this.queryById(xiaofei.getHykid());
    }

    /**
     * 通过主键删除数据
     *
     * @param hykid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String hykid) {
        return this.xiaofeiDao.deleteById(hykid) > 0;
    }
}