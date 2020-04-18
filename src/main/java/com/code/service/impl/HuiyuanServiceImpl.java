package com.code.service.impl;

import com.code.entity.Huiyuan;
import com.code.dao.HuiyuanDao;
import com.code.service.HuiyuanService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Huiyuan)表服务实现类
 *
 * @author yap
 * @since 2020-04-18 16:52:54
 */
@Service("huiyuanService")
public class HuiyuanServiceImpl implements HuiyuanService {
    @Resource
    private HuiyuanDao huiyuanDao;

    /**
     * 通过ID查询单条数据
     *
     * @param hyid 主键
     * @return 实例对象
     */
    @Override
    public Huiyuan queryById(String hyid) {
        return this.huiyuanDao.queryById(hyid);
    }

    /**
     * 查询多条数据
     *
     * @param 
     * @param 
     * @return 对象列表
     */
    @Override
    public List<Huiyuan> selectAll(){
        return this.huiyuanDao.selectAll();
    }

    /**
     * 新增数据
     *
     * @param huiyuan 实例对象
     * @return 实例对象
     */
    @Override
    public Huiyuan insert(Huiyuan huiyuan) {
        this.huiyuanDao.insert(huiyuan);
        return huiyuan;
    }

    /**
     * 修改数据
     *
     * @param huiyuan 实例对象
     * @return 实例对象
     */
    @Override
    public Huiyuan update(Huiyuan huiyuan) {
        this.huiyuanDao.update(huiyuan);
        return this.queryById(huiyuan.getHyid());
    }

    /**
     * 通过主键删除数据
     *
     * @param hyid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String hyid) {
        return this.huiyuanDao.deleteById(hyid) > 0;
    }
}