package com.code.entity;

import java.io.Serializable;

/**
 * (Suppliertype)实体类
 *
 * @author yap
 * @since 2020-04-18 16:52:56
 */
public class Suppliertype implements Serializable {
    private static final long serialVersionUID = 122022888306883523L;
    
    private Integer stypeid;
    
    private String stypename;


    public Integer getStypeid() {
        return stypeid;
    }

    public void setStypeid(Integer stypeid) {
        this.stypeid = stypeid;
    }

    public String getStypename() {
        return stypename;
    }

    public void setStypename(String stypename) {
        this.stypename = stypename;
    }

}