package com.code.controller;

import com.code.entity.Saleandorder2;
import com.code.service.Saleandorder2Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import javax.annotation.Resource;

/**
 * (Saleandorder2)表控制层
 *
 * @author yap
 * @since 2020-04-18 16:52:56
 */
@RestController
@RequestMapping("saleandorder2")
public class Saleandorder2Controller {
    /**
     * 服务对象
     */
    @Resource
    private Saleandorder2Service saleandorder2Service;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Saleandorder2 selectOne(Integer id) {
        return this.saleandorder2Service.queryById(id);
    }
    
    @RequestMapping("selectAll")
    public List<Saleandorder2> selectAll(){
           return this.saleandorder2Service.selectAll();
    }

}