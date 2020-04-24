package com.code.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Botpetinventory)实体类
 *
 * @author yap
 * @since 2020-04-19 02:16:40
 */
public class Botpetinventory implements Serializable {
    private static final long serialVersionUID = 938658156181407106L;
    /**
    * 盘点记录id
    */
    private Integer botpetinventoryid;
    /**
    * 盘点时间
    */
    private Date time;
    /**
    * 盘点仓库
    */
    private Integer ware;
    /**
    * 盘点结果
    */
    private Integer result;


    public Integer getBotpetinventoryid() {
        return botpetinventoryid;
    }

    public void setBotpetinventoryid(Integer botpetinventoryid) {
        this.botpetinventoryid = botpetinventoryid;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Integer getWare() {
        return ware;
    }

    public void setWare(Integer ware) {
        this.ware = ware;
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

}