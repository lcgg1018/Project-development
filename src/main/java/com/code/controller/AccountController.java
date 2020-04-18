package com.code.controller;

import com.code.entity.Account;
import com.code.service.AccountService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Account)表控制层
 *
 * @author yap
 * @since 2020-04-18 16:51:02
 */
@RestController
@RequestMapping("account")
public class AccountController {
    /**
     * 服务对象
     */
    @Resource
    private AccountService accountService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Account selectOne(Integer id) {
        return this.accountService.queryById(id);
    }

    @RequestMapping("selectAll")
    public List<Account> selectAll(){
           return this.accountService.selectAll();
    }

}
