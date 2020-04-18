package com.code.service.impl;

import com.code.entity.Botpetinventory;
import com.code.dao.BotpetinventoryDao;
import com.code.service.BotpetinventoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Botpetinventory)表服务实现类
 *
 * @author yap
 * @since 2020-04-18 16:52:54
 */
@Service("botpetinventoryService")
public class BotpetinventoryServiceImpl implements BotpetinventoryService {
    @Resource
    private BotpetinventoryDao botpetinventoryDao;

    /**
     * 通过ID查询单条数据
     *
     * @param botpetinventoryid 主键
     * @return 实例对象
     */
    @Override
    public Botpetinventory queryById(Integer botpetinventoryid) {
        return this.botpetinventoryDao.queryById(botpetinventoryid);
    }

    /**
     * 查询多条数据
     *
     * @param 
     * @param 
     * @return 对象列表
     */
    @Override
    public List<Botpetinventory> selectAll(){
        return this.botpetinventoryDao.selectAll();
    }

    /**
     * 新增数据
     *
     * @param botpetinventory 实例对象
     * @return 实例对象
     */
    @Override
    public Botpetinventory insert(Botpetinventory botpetinventory) {
        this.botpetinventoryDao.insert(botpetinventory);
        return botpetinventory;
    }

    /**
     * 修改数据
     *
     * @param botpetinventory 实例对象
     * @return 实例对象
     */
    @Override
    public Botpetinventory update(Botpetinventory botpetinventory) {
        this.botpetinventoryDao.update(botpetinventory);
        return this.queryById(botpetinventory.getBotpetinventoryid());
    }

    /**
     * 通过主键删除数据
     *
     * @param botpetinventoryid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer botpetinventoryid) {
        return this.botpetinventoryDao.deleteById(botpetinventoryid) > 0;
    }
}