package com.code.service.impl;

import com.code.entity.Address;
import com.code.dao.AddressDao;
import com.code.service.AddressService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Address)表服务实现类
 *
 * @author yap
 * @since 2020-04-18 16:52:54
 */
@Service("addressService")
public class AddressServiceImpl implements AddressService {
    @Resource
    private AddressDao addressDao;

    /**
     * 通过ID查询单条数据
     *
     * @param aabbreviation 主键
     * @return 实例对象
     */
    @Override
    public Address queryById(String aabbreviation) {
        return this.addressDao.queryById(aabbreviation);
    }

    /**
     * 查询多条数据
     *
     * @param 
     * @param 
     * @return 对象列表
     */
    @Override
    public List<Address> selectAll(){
        return this.addressDao.selectAll();
    }

    /**
     * 新增数据
     *
     * @param address 实例对象
     * @return 实例对象
     */
    @Override
    public Address insert(Address address) {
        this.addressDao.insert(address);
        return address;
    }

    /**
     * 修改数据
     *
     * @param address 实例对象
     * @return 实例对象
     */
    @Override
    public Address update(Address address) {
        this.addressDao.update(address);
        return this.queryById(address.getAabbreviation());
    }

    /**
     * 通过主键删除数据
     *
     * @param aabbreviation 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String aabbreviation) {
        return this.addressDao.deleteById(aabbreviation) > 0;
    }
}