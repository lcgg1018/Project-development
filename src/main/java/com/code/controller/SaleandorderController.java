package com.code.controller;

import com.code.entity.Saleandorder;
import com.code.service.SaleandorderService;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;

/**
 * (Saleandorder)表控制层
 *
 * @author yap
 * @since 2020-04-26 16:29:19
 */
@RestController
@RequestMapping("saleandorder")
public class SaleandorderController {
    /**
     * 服务对象
     */
    @Resource
    private SaleandorderService saleandorderService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Saleandorder selectOne(Integer id) {
        return this.saleandorderService.queryById(id);
    }


        /**
     * 查询某张表所有数据，搭配PageHelper使用更佳！
     *
     * @param
     * @return 对象列表
     */
        @RequestMapping("selectAll")
        public Map<String,Object> selectAll(@RequestParam("page") int pageNum, @RequestParam("limit") int pageSize){
            PageInfo<Saleandorder> pageInfo = this.saleandorderService.selectAllForPage(pageNum,pageSize);
            System.out.println(pageInfo);
            Map<String,Object> map = new HashMap<>();
            map.put("data",pageInfo.getList());
            map.put("code",0);
            map.put("count",pageInfo.getTotal());
            return map;
        }


        /**
     * 通过实体作为筛选条件查询
     *
     * @param saleandorder 实例对象
     * @return 对象列表
     */
    @RequestMapping("queryAll")
    public List<Saleandorder>  queryAll(Saleandorder saleandorder){
           return this.saleandorderService.queryAll(saleandorder);
    }

}
