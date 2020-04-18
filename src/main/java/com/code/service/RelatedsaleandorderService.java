package com.code.service;

import com.code.entity.Relatedsaleandorder;
import java.util.List;

/**
 * (Relatedsaleandorder)表服务接口
 *
 * @author yap
 * @since 2020-04-18 23:26:00
 */
public interface RelatedsaleandorderService {

    /**
     * 通过ID查询单条数据
     *
     * @param  主键
     * @return 实例对象
     */
    Relatedsaleandorder queryById( );

    /**
     * 查询多条数据
     *
     * @param 
     * @param
     * @return 对象列表
     */
    List<Relatedsaleandorder>selectAll();

    /**
     * 新增数据
     *
     * @param relatedsaleandorder 实例对象
     * @return 实例对象
     */
    Relatedsaleandorder insert(Relatedsaleandorder relatedsaleandorder);

    /**
     * 修改数据
     *
     * @param relatedsaleandorder 实例对象
     * @return 实例对象
     */
    Relatedsaleandorder update(Relatedsaleandorder relatedsaleandorder);

    /**
     * 通过主键删除数据
     *
     * @param  主键
     * @return 是否成功
     */
    boolean deleteById( );

}