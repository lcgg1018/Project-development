package com.code.service;

import com.code.entity.Xiaofei;
import java.util.List;

/**
 * 会员消费记录表(Xiaofei)表服务接口
 *
 * @author yap
 * @since 2020-04-18 16:52:56
 */
public interface XiaofeiService {

    /**
     * 通过ID查询单条数据
     *
     * @param hykid 主键
     * @return 实例对象
     */
    Xiaofei queryById(String hykid);

    /**
     * 查询多条数据
     *
     * @param 
     * @param
     * @return 对象列表
     */
    List<Xiaofei>selectAll();

    /**
     * 新增数据
     *
     * @param xiaofei 实例对象
     * @return 实例对象
     */
    Xiaofei insert(Xiaofei xiaofei);

    /**
     * 修改数据
     *
     * @param xiaofei 实例对象
     * @return 实例对象
     */
    Xiaofei update(Xiaofei xiaofei);

    /**
     * 通过主键删除数据
     *
     * @param hykid 主键
     * @return 是否成功
     */
    boolean deleteById(String hykid);

}