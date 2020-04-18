package com.code.controller;

import com.code.entity.Kehu;
import com.code.service.KehuService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import javax.annotation.Resource;

/**
 * (Kehu)表控制层
 *
 * @author yap
 * @since 2020-04-18 16:52:54
 */
@RestController
@RequestMapping("kehu")
public class KehuController {
    /**
     * 服务对象
     */
    @Resource
    private KehuService kehuService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Kehu selectOne(String id) {
        return this.kehuService.queryById(id);
    }
    
    @RequestMapping("selectAll")
    public List<Kehu> selectAll(){
           return this.kehuService.selectAll();
    }

}