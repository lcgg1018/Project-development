package com.code.service;

import com.code.entity.Zhuxiao;
import java.util.List;

/**
 * 会员卡注销表(Zhuxiao)表服务接口
 *
 * @author yap
 * @since 2020-04-18 16:52:56
 */
public interface ZhuxiaoService {

    /**
     * 通过ID查询单条数据
     *
     * @param hykkh 主键
     * @return 实例对象
     */
    Zhuxiao queryById(String hykkh);

    /**
     * 查询多条数据
     *
     * @param 
     * @param
     * @return 对象列表
     */
    List<Zhuxiao>selectAll();

    /**
     * 新增数据
     *
     * @param zhuxiao 实例对象
     * @return 实例对象
     */
    Zhuxiao insert(Zhuxiao zhuxiao);

    /**
     * 修改数据
     *
     * @param zhuxiao 实例对象
     * @return 实例对象
     */
    Zhuxiao update(Zhuxiao zhuxiao);

    /**
     * 通过主键删除数据
     *
     * @param hykkh 主键
     * @return 是否成功
     */
    boolean deleteById(String hykkh);

}