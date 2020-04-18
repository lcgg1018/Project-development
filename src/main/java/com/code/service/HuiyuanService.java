package com.code.service;

import com.code.entity.Huiyuan;
import java.util.List;

/**
 * (Huiyuan)表服务接口
 *
 * @author yap
 * @since 2020-04-18 16:52:54
 */
public interface HuiyuanService {

    /**
     * 通过ID查询单条数据
     *
     * @param hyid 主键
     * @return 实例对象
     */
    Huiyuan queryById(String hyid);

    /**
     * 查询多条数据
     *
     * @param 
     * @param
     * @return 对象列表
     */
    List<Huiyuan>selectAll();

    /**
     * 新增数据
     *
     * @param huiyuan 实例对象
     * @return 实例对象
     */
    Huiyuan insert(Huiyuan huiyuan);

    /**
     * 修改数据
     *
     * @param huiyuan 实例对象
     * @return 实例对象
     */
    Huiyuan update(Huiyuan huiyuan);

    /**
     * 通过主键删除数据
     *
     * @param hyid 主键
     * @return 是否成功
     */
    boolean deleteById(String hyid);

}