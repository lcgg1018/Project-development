package com.code.controller;

import com.code.entity.Botpetinventory;
import com.code.service.BotpetinventoryService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import javax.annotation.Resource;

/**
 * (Botpetinventory)表控制层
 *
 * @author yap
 * @since 2020-04-18 16:52:54
 */
@RestController
@RequestMapping("botpetinventory")
public class BotpetinventoryController {
    /**
     * 服务对象
     */
    @Resource
    private BotpetinventoryService botpetinventoryService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Botpetinventory selectOne(Integer id) {
        return this.botpetinventoryService.queryById(id);
    }
    
    @RequestMapping("selectAll")
    public List<Botpetinventory> selectAll(){
           return this.botpetinventoryService.selectAll();
    }

}