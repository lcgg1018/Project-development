package com.code.controller;

import com.code.entity.Huiyuankai;
import com.code.service.HuiyuankaiService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import javax.annotation.Resource;

/**
 * 会员卡信息表(Huiyuankai)表控制层
 *
 * @author yap
 * @since 2020-04-18 16:52:54
 */
@RestController
@RequestMapping("huiyuankai")
public class HuiyuankaiController {
    /**
     * 服务对象
     */
    @Resource
    private HuiyuankaiService huiyuankaiService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Huiyuankai selectOne(String id) {
        return this.huiyuankaiService.queryById(id);
    }
    
    @RequestMapping("selectAll")
    public List<Huiyuankai> selectAll(){
           return this.huiyuankaiService.selectAll();
    }

}