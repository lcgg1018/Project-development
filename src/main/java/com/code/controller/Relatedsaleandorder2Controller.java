package com.code.controller;

import com.code.entity.Relatedsaleandorder2;
import com.code.service.Relatedsaleandorder2Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import javax.annotation.Resource;

/**
 * (Relatedsaleandorder2)表控制层
 *
 * @author yap
 * @since 2020-04-18 16:52:56
 */
@RestController
@RequestMapping("relatedsaleandorder2")
public class Relatedsaleandorder2Controller {
    /**
     * 服务对象
     */
    @Resource
    private Relatedsaleandorder2Service relatedsaleandorder2Service;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Relatedsaleandorder2 selectOne( id) {
        return this.relatedsaleandorder2Service.queryById(id);
    }
    
    @RequestMapping("selectAll")
    public List<Relatedsaleandorder2> selectAll(){
           return this.relatedsaleandorder2Service.selectAll();
    }

}