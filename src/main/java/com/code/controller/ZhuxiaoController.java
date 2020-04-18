package com.code.controller;

import com.code.entity.Zhuxiao;
import com.code.service.ZhuxiaoService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import javax.annotation.Resource;

/**
 * 会员卡注销表(Zhuxiao)表控制层
 *
 * @author yap
 * @since 2020-04-18 16:52:56
 */
@RestController
@RequestMapping("zhuxiao")
public class ZhuxiaoController {
    /**
     * 服务对象
     */
    @Resource
    private ZhuxiaoService zhuxiaoService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Zhuxiao selectOne(String id) {
        return this.zhuxiaoService.queryById(id);
    }
    
    @RequestMapping("selectAll")
    public List<Zhuxiao> selectAll(){
           return this.zhuxiaoService.selectAll();
    }

}