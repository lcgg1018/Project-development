package com.code.controller;

import com.code.entity.Xiaofei;
import com.code.service.XiaofeiService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import javax.annotation.Resource;

/**
 * 会员消费记录表(Xiaofei)表控制层
 *
 * @author yap
 * @since 2020-04-18 16:52:56
 */
@RestController
@RequestMapping("xiaofei")
public class XiaofeiController {
    /**
     * 服务对象
     */
    @Resource
    private XiaofeiService xiaofeiService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Xiaofei selectOne(String id) {
        return this.xiaofeiService.queryById(id);
    }
    
    @RequestMapping("selectAll")
    public List<Xiaofei> selectAll(){
           return this.xiaofeiService.selectAll();
    }

}