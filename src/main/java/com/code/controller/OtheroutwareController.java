package com.code.controller;

import com.code.entity.Otheroutware;
import com.code.service.OtheroutwareService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import javax.annotation.Resource;

/**
 * (Otheroutware)表控制层
 *
 * @author yap
 * @since 2020-04-18 16:52:55
 */
@RestController
@RequestMapping("otheroutware")
public class OtheroutwareController {
    /**
     * 服务对象
     */
    @Resource
    private OtheroutwareService otheroutwareService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Otheroutware selectOne(Integer id) {
        return this.otheroutwareService.queryById(id);
    }
    
    @RequestMapping("selectAll")
    public List<Otheroutware> selectAll(){
           return this.otheroutwareService.selectAll();
    }

}