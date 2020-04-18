package com.code.service;

import com.code.entity.Botpetinventory;
import java.util.List;

/**
 * (Botpetinventory)表服务接口
 *
 * @author yap
 * @since 2020-04-18 16:52:54
 */
public interface BotpetinventoryService {

    /**
     * 通过ID查询单条数据
     *
     * @param botpetinventoryid 主键
     * @return 实例对象
     */
    Botpetinventory queryById(Integer botpetinventoryid);

    /**
     * 查询多条数据
     *
     * @param 
     * @param
     * @return 对象列表
     */
    List<Botpetinventory>selectAll();

    /**
     * 新增数据
     *
     * @param botpetinventory 实例对象
     * @return 实例对象
     */
    Botpetinventory insert(Botpetinventory botpetinventory);

    /**
     * 修改数据
     *
     * @param botpetinventory 实例对象
     * @return 实例对象
     */
    Botpetinventory update(Botpetinventory botpetinventory);

    /**
     * 通过主键删除数据
     *
     * @param botpetinventoryid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer botpetinventoryid);

}