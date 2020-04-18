package com.code.service.impl;

import com.code.entity.Huiyuankai;
import com.code.dao.HuiyuankaiDao;
import com.code.service.HuiyuankaiService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 会员卡信息表(Huiyuankai)表服务实现类
 *
 * @author yap
 * @since 2020-04-18 16:52:54
 */
@Service("huiyuankaiService")
public class HuiyuankaiServiceImpl implements HuiyuankaiService {
    @Resource
    private HuiyuankaiDao huiyuankaiDao;

    /**
     * 通过ID查询单条数据
     *
     * @param hykkh 主键
     * @return 实例对象
     */
    @Override
    public Huiyuankai queryById(String hykkh) {
        return this.huiyuankaiDao.queryById(hykkh);
    }

    /**
     * 查询多条数据
     *
     * @param 
     * @param 
     * @return 对象列表
     */
    @Override
    public List<Huiyuankai> selectAll(){
        return this.huiyuankaiDao.selectAll();
    }

    /**
     * 新增数据
     *
     * @param huiyuankai 实例对象
     * @return 实例对象
     */
    @Override
    public Huiyuankai insert(Huiyuankai huiyuankai) {
        this.huiyuankaiDao.insert(huiyuankai);
        return huiyuankai;
    }

    /**
     * 修改数据
     *
     * @param huiyuankai 实例对象
     * @return 实例对象
     */
    @Override
    public Huiyuankai update(Huiyuankai huiyuankai) {
        this.huiyuankaiDao.update(huiyuankai);
        return this.queryById(huiyuankai.getHykkh());
    }

    /**
     * 通过主键删除数据
     *
     * @param hykkh 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String hykkh) {
        return this.huiyuankaiDao.deleteById(hykkh) > 0;
    }
}