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
 * @since 2020-04-19 02:16:39
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
    
    
        /**
     * 查询某张表所有数据，搭配PageHelper使用更佳！
     *
     * @param
     * @return 对象列表
     */
    @RequestMapping("selectAll")
    public List<Huiyuankai> selectAll(){
           return this.huiyuankaiService.selectAll();
    }
    
    
        /**
     * 通过实体作为筛选条件查询
     *
     * @param huiyuankai 实例对象
     * @return 对象列表
     */
    @RequestMapping("queryAll")
    public List<Huiyuankai>  queryAll(Huiyuankai huiyuankai){
           return this.huiyuankaiService.queryAll(huiyuankai);
    }

}