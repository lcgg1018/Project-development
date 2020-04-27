package com.code.dao;

import com.code.entity.Relatedsaleandorder2;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Relatedsaleandorder2)表数据库访问层
 *
 * @author yap
 * @since 2020-04-26 16:29:19
 */
public interface Relatedsaleandorder2Dao {

    /**
     * 通过ID查询单条数据
     *
     * @param rid 主键
     * @return 实例对象
     */
    Relatedsaleandorder2 queryById(Integer rid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Relatedsaleandorder2> selectAll();


    /**
     * 通过实体作为筛选条件查询
     *
     * @param relatedsaleandorder2 实例对象
     * @return 对象列表
     */
    List<Relatedsaleandorder2> queryAll(Relatedsaleandorder2 relatedsaleandorder2);

    /**
     * 新增数据
     *
     * @param relatedsaleandorder2 实例对象
     * @return 影响行数
     */
    int insert(Relatedsaleandorder2 relatedsaleandorder2);

    /**
     * 修改数据
     *
     * @param relatedsaleandorder2 实例对象
     * @return 影响行数
     */
    int update(Relatedsaleandorder2 relatedsaleandorder2);

    /**
     * 通过主键删除数据
     *
     * @param rid 主键
     * @return 影响行数
     */
    int deleteById(Integer rid);

}