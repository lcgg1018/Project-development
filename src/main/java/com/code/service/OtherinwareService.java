package com.code.service;

import com.code.entity.Otherinware;
import java.util.List;

/**
 * (Otherinware)表服务接口
 *
 * @author yap
 * @since 2020-04-18 16:52:54
 */
public interface OtherinwareService {

    /**
     * 通过ID查询单条数据
     *
     * @param otherinwareid 主键
     * @return 实例对象
     */
    Otherinware queryById(Integer otherinwareid);

    /**
     * 查询多条数据
     *
     * @param 
     * @param
     * @return 对象列表
     */
    List<Otherinware>selectAll();

    /**
     * 新增数据
     *
     * @param otherinware 实例对象
     * @return 实例对象
     */
    Otherinware insert(Otherinware otherinware);

    /**
     * 修改数据
     *
     * @param otherinware 实例对象
     * @return 实例对象
     */
    Otherinware update(Otherinware otherinware);

    /**
     * 通过主键删除数据
     *
     * @param otherinwareid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer otherinwareid);

}