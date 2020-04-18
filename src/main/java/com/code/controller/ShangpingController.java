package com.code.controller;

import com.code.entity.Shangping;
import com.code.service.ShangpingService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import javax.annotation.Resource;

/**
 * (Shangping)表控制层
 *
 * @author yap
 * @since 2020-04-18 16:52:56
 */
@RestController
@RequestMapping("shangping")
public class ShangpingController {
    /**
     * 服务对象
     */
    @Resource
    private ShangpingService shangpingService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Shangping selectOne(String id) {
        return this.shangpingService.queryById(id);
    }
    
    @RequestMapping("selectAll")
    public List<Shangping> selectAll(){
           return this.shangpingService.selectAll();
    }

}