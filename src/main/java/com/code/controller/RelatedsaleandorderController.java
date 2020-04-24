package com.code.controller;

import com.code.entity.Relatedsaleandorder;
import com.code.service.RelatedsaleandorderService;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;

/**
 * (Relatedsaleandorder)表控制层
 *
 * @author yap
 * @since 2020-04-19 02:16:42
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
    public Relatedsaleandorder selectOne(Integer id) {
        return this.relatedsaleandorderService.queryById(id);
    }


        /**
     * 查询某张表所有数据，搭配PageHelper使用更佳！
     *
     * @param
     * @return 对象列表
     */
    @RequestMapping("selectAll")
    public List<Relatedsaleandorder> selectAll(){
           return this.relatedsaleandorderService.selectAll();
    }


        /**
     * 通过实体作为筛选条件查询
     *
     * @param relatedsaleandorder 实例对象
     * @return 对象列表
     */
    @RequestMapping("queryAll")
    public Map<String,Object> queryAll(Relatedsaleandorder relatedsaleandorder){
        System.out.println(relatedsaleandorder);
        Map<String,Object> map = new HashMap<>();
        List<Relatedsaleandorder> list = this.relatedsaleandorderService.queryAll(relatedsaleandorder);
        map.put("data",list);
        map.put("code",0);
        map.put("total",list.size());
        return map;
    }

}
