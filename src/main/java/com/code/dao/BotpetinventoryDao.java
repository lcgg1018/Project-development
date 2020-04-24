package com.code.dao;

import com.code.entity.Botpetinventory;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Botpetinventory)表数据库访问层
 *
 * @author yap
 * @since 2020-04-19 02:16:40
 */
public interface BotpetinventoryDao {

    /**
     * 通过ID查询单条数据
     *
     * @param botpetinventoryid 主键
     * @return 实例对象
     */
    Botpetinventory queryById(Integer botpetinventoryid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Botpetinventory> selectAll();


    /**
     * 通过实体作为筛选条件查询
     *
     * @param botpetinventory 实例对象
     * @return 对象列表
     */
    List<Botpetinventory> queryAll(Botpetinventory botpetinventory);

    /**
     * 新增数据
     *
     * @param botpetinventory 实例对象
     * @return 影响行数
     */
    int insert(Botpetinventory botpetinventory);

    /**
     * 修改数据
     *
     * @param botpetinventory 实例对象
     * @return 影响行数
     */
    int update(Botpetinventory botpetinventory);

    /**
     * 通过主键删除数据
     *
     * @param botpetinventoryid 主键
     * @return 影响行数
     */
    int deleteById(Integer botpetinventoryid);

}