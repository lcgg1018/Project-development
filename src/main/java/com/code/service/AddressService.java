package com.code.service;

import com.code.entity.Address;
import java.util.List;

/**
 * (Address)表服务接口
 *
 * @author yap
 * @since 2020-04-19 02:16:39
 */
public interface AddressService {

    /**
     * 通过ID查询单条数据
     *
     * @param aabbreviation 主键
     * @return 实例对象
     */
    Address queryById(String aabbreviation);

    /**
     * 查询多条数据
     *
     * @param 
     * @param
     * @return 对象列表
     */
    List<Address>selectAll();

    /**
     * 新增数据
     *
     * @param address 实例对象
     * @return 实例对象
     */
    Address insert(Address address);

    /**
     * 通过实体作为筛选条件查询
     *
     * @param address 实例对象
     * @return 对象列表
     */
    List<Address> queryAll(Address address);

    /**
     * 修改数据
     *
     * @param address 实例对象
     * @return 实例对象
     */
    Address update(Address address);

    /**
     * 通过主键删除数据
     *
     * @param aabbreviation 主键
     * @return 是否成功
     */
    boolean deleteById(String aabbreviation);

}