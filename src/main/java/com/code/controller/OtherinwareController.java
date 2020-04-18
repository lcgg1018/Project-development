package com.code.controller;

import com.code.entity.Otherinware;
import com.code.service.OtherinwareService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import javax.annotation.Resource;

/**
 * (Otherinware)表控制层
 *
 * @author yap
 * @since 2020-04-18 16:52:55
 */
@RestController
@RequestMapping("otherinware")
public class OtherinwareController {
    /**
     * 服务对象
     */
    @Resource
    private OtherinwareService otherinwareService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Otherinware selectOne(Integer id) {
        return this.otherinwareService.queryById(id);
    }
    
    @RequestMapping("selectAll")
    public List<Otherinware> selectAll(){
           return this.otherinwareService.selectAll();
    }

}