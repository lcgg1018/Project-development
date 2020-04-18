package com.code.service;

import com.code.entity.Saleandorder2;
import java.util.List;

/**
 * (Saleandorder2)表服务接口
 *
 * @author yap
 * @since 2020-04-18 16:52:56
 */
public interface Saleandorder2Service {

    /**
     * 通过ID查询单条数据
     *
     * @param sid 主键
     * @return 实例对象
     */
    Saleandorder2 queryById(Integer sid);

    /**
     * 查询多条数据
     *
     * @param 
     * @param
     * @return 对象列表
     */
    List<Saleandorder2>selectAll();

    /**
     * 新增数据
     *
     * @param saleandorder2 实例对象
     * @return 实例对象
     */
    Saleandorder2 insert(Saleandorder2 saleandorder2);

    /**
     * 修改数据
     *
     * @param saleandorder2 实例对象
     * @return 实例对象
     */
    Saleandorder2 update(Saleandorder2 saleandorder2);

    /**
     * 通过主键删除数据
     *
     * @param sid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer sid);

}