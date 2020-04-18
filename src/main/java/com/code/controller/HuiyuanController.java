package com.code.controller;

import com.code.entity.Huiyuan;
import com.code.service.HuiyuanService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import javax.annotation.Resource;

/**
 * (Huiyuan)表控制层
 *
 * @author yap
 * @since 2020-04-18 16:52:54
 */
@RestController
@RequestMapping("huiyuan")
public class HuiyuanController {
    /**
     * 服务对象
     */
    @Resource
    private HuiyuanService huiyuanService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Huiyuan selectOne(String id) {
        return this.huiyuanService.queryById(id);
    }
    
    @RequestMapping("selectAll")
    public List<Huiyuan> selectAll(){
           return this.huiyuanService.selectAll();
    }

}