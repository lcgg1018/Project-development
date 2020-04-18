package com.code.service;

import com.code.entity.Shangping;
import java.util.List;

/**
 * (Shangping)表服务接口
 *
 * @author yap
 * @since 2020-04-18 16:52:56
 */
public interface ShangpingService {

    /**
     * 通过ID查询单条数据
     *
     * @param spid 主键
     * @return 实例对象
     */
    Shangping queryById(String spid);

    /**
     * 查询多条数据
     *
     * @param 
     * @param
     * @return 对象列表
     */
    List<Shangping>selectAll();

    /**
     * 新增数据
     *
     * @param shangping 实例对象
     * @return 实例对象
     */
    Shangping insert(Shangping shangping);

    /**
     * 修改数据
     *
     * @param shangping 实例对象
     * @return 实例对象
     */
    Shangping update(Shangping shangping);

    /**
     * 通过主键删除数据
     *
     * @param spid 主键
     * @return 是否成功
     */
    boolean deleteById(String spid);

}