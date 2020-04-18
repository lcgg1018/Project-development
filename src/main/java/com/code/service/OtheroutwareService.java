package com.code.service;

import com.code.entity.Otheroutware;
import java.util.List;

/**
 * (Otheroutware)表服务接口
 *
 * @author yap
 * @since 2020-04-19 02:16:40
 */
public interface OtheroutwareService {

    /**
     * 通过ID查询单条数据
     *
     * @param otheroutwareid 主键
     * @return 实例对象
     */
    Otheroutware queryById(Integer otheroutwareid);

    /**
     * 查询多条数据
     *
     * @param 
     * @param
     * @return 对象列表
     */
    List<Otheroutware>selectAll();

    /**
     * 新增数据
     *
     * @param otheroutware 实例对象
     * @return 实例对象
     */
    Otheroutware insert(Otheroutware otheroutware);

    /**
     * 通过实体作为筛选条件查询
     *
     * @param otheroutware 实例对象
     * @return 对象列表
     */
    List<Otheroutware> queryAll(Otheroutware otheroutware);

    /**
     * 修改数据
     *
     * @param otheroutware 实例对象
     * @return 实例对象
     */
    Otheroutware update(Otheroutware otheroutware);

    /**
     * 通过主键删除数据
     *
     * @param otheroutwareid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer otheroutwareid);

}