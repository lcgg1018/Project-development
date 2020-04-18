package com.code.service.impl;

import com.code.entity.Zhuxiao;
import com.code.dao.ZhuxiaoDao;
import com.code.service.ZhuxiaoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 会员卡注销表(Zhuxiao)表服务实现类
 *
 * @author yap
 * @since 2020-04-18 16:52:56
 */
@Service("zhuxiaoService")
public class ZhuxiaoServiceImpl implements ZhuxiaoService {
    @Resource
    private ZhuxiaoDao zhuxiaoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param hykkh 主键
     * @return 实例对象
     */
    @Override
    public Zhuxiao queryById(String hykkh) {
        return this.zhuxiaoDao.queryById(hykkh);
    }

    /**
     * 查询多条数据
     *
     * @param 
     * @param 
     * @return 对象列表
     */
    @Override
    public List<Zhuxiao> selectAll(){
        return this.zhuxiaoDao.selectAll();
    }

    /**
     * 新增数据
     *
     * @param zhuxiao 实例对象
     * @return 实例对象
     */
    @Override
    public Zhuxiao insert(Zhuxiao zhuxiao) {
        this.zhuxiaoDao.insert(zhuxiao);
        return zhuxiao;
    }

    /**
     * 修改数据
     *
     * @param zhuxiao 实例对象
     * @return 实例对象
     */
    @Override
    public Zhuxiao update(Zhuxiao zhuxiao) {
        this.zhuxiaoDao.update(zhuxiao);
        return this.queryById(zhuxiao.getHykkh());
    }

    /**
     * 通过主键删除数据
     *
     * @param hykkh 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String hykkh) {
        return this.zhuxiaoDao.deleteById(hykkh) > 0;
    }
}