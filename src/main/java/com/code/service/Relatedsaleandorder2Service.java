package com.code.service;

import com.code.entity.Relatedsaleandorder2;
import java.util.List;

/**
 * (Relatedsaleandorder2)表服务接口
 *
 * @author yap
 * @since 2020-04-18 23:26:31
 */
public interface Relatedsaleandorder2Service {

    /**
     * 通过ID查询单条数据
     *
     * @param rid 主键
     * @return 实例对象
     */
    Relatedsaleandorder2 queryById(Integer rid);

    /**
     * 查询多条数据
     *
     * @param 
     * @param
     * @return 对象列表
     */
    List<Relatedsaleandorder2>selectAll();

    /**
     * 新增数据
     *
     * @param relatedsaleandorder2 实例对象
     * @return 实例对象
     */
    Relatedsaleandorder2 insert(Relatedsaleandorder2 relatedsaleandorder2);

    /**
     * 修改数据
     *
     * @param relatedsaleandorder2 实例对象
     * @return 实例对象
     */
    Relatedsaleandorder2 update(Relatedsaleandorder2 relatedsaleandorder2);

    /**
     * 通过主键删除数据
     *
     * @param rid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer rid);

}