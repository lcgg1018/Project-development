package com.code.controller;

import com.code.entity.Dengji;
import com.code.service.DengjiService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import javax.annotation.Resource;

/**
 * (Dengji)表控制层
 *
 * @author yap
 * @since 2020-04-18 16:52:54
 */
@RestController
@RequestMapping("dengji")
public class DengjiController {
    /**
     * 服务对象
     */
    @Resource
    private DengjiService dengjiService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Dengji selectOne(Integer id) {
        return this.dengjiService.queryById(id);
    }
    
    @RequestMapping("selectAll")
    public List<Dengji> selectAll(){
           return this.dengjiService.selectAll();
    }

}