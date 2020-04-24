package com.code.service;

import com.code.entity.Transfersorder;
import java.util.List;

/**
 * (Transfersorder)表服务接口
 *
 * @author yap
 * @since 2020-04-19 02:16:40
 */
public interface TransfersorderService {

    /**
     * 通过ID查询单条数据
     *
     * @param transfersorderid 主键
     * @return 实例对象
     */
    Transfersorder queryById(Integer transfersorderid);

    /**
     * 查询多条数据
     *
     * @param 
     * @param
     * @return 对象列表
     */
    List<Transfersorder>selectAll();

    /**
     * 新增数据
     *
     * @param transfersorder 实例对象
     * @return 实例对象
     */
    Transfersorder insert(Transfersorder transfersorder);

    /**
     * 通过实体作为筛选条件查询
     *
     * @param transfersorder 实例对象
     * @return 对象列表
     */
    List<Transfersorder> queryAll(Transfersorder transfersorder);

    /**
     * 修改数据
     *
     * @param transfersorder 实例对象
     * @return 实例对象
     */
    Transfersorder update(Transfersorder transfersorder);

    /**
     * 通过主键删除数据
     *
     * @param transfersorderid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer transfersorderid);

}