package com.code.controller;

import com.code.entity.Relatedsaleandorder;
import com.code.service.RelatedsaleandorderService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import javax.annotation.Resource;

/**
 * (Relatedsaleandorder)表控制层
 *
 * @author yap
 * @since 2020-04-18 23:26:00
 */
@RestController
@RequestMapping("relatedsaleandorder")
public class RelatedsaleandorderController {
    /**
     * 服务对象
     */
    @Resource
    private RelatedsaleandorderService relatedsaleandorderService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Relatedsaleandorder selectOne( id) {
        return this.relatedsaleandorderService.queryById(id);
    }
    
    @RequestMapping("selectAll")
    public List<Relatedsaleandorder> selectAll(){
           return this.relatedsaleandorderService.selectAll();
    }

}