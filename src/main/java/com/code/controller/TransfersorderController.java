package com.code.controller;

import com.code.entity.Transfersorder;
import com.code.service.TransfersorderService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import javax.annotation.Resource;

/**
 * (Transfersorder)表控制层
 *
 * @author yap
 * @since 2020-04-18 16:52:56
 */
@RestController
@RequestMapping("transfersorder")
public class TransfersorderController {
    /**
     * 服务对象
     */
    @Resource
    private TransfersorderService transfersorderService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Transfersorder selectOne(Integer id) {
        return this.transfersorderService.queryById(id);
    }
    
    @RequestMapping("selectAll")
    public List<Transfersorder> selectAll(){
           return this.transfersorderService.selectAll();
    }

}