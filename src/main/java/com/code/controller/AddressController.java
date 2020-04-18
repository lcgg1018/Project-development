package com.code.controller;

import com.code.entity.Address;
import com.code.service.AddressService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import javax.annotation.Resource;

/**
 * (Address)表控制层
 *
 * @author yap
 * @since 2020-04-18 16:52:54
 */
@RestController
@RequestMapping("address")
public class AddressController {
    /**
     * 服务对象
     */
    @Resource
    private AddressService addressService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Address selectOne(String id) {
        return this.addressService.queryById(id);
    }
    
    @RequestMapping("selectAll")
    public List<Address> selectAll(){
           return this.addressService.selectAll();
    }

}