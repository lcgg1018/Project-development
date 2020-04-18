package com.code.entity;

import java.io.Serializable;

/**
 * (Action)实体类
 *
 * @author yap
 * @since 2020-04-19 02:16:42
 */
public class Action implements Serializable {
    private static final long serialVersionUID = -62032266208681020L;
    /**
    * 权限id
    */
    private Integer actionId;
    /**
    * 权限路由
    */
    private String actionUrl;
    /**
    * 父级权限id
    */
    private Integer actionGroupId;
    /**
    * 权限名称
    */
    private String actionName;


    public Integer getActionId() {
        return actionId;
    }

    public void setActionId(Integer actionId) {
        this.actionId = actionId;
    }

    public String getActionUrl() {
        return actionUrl;
    }

    public void setActionUrl(String actionUrl) {
        this.actionUrl = actionUrl;
    }

    public Integer getActionGroupId() {
        return actionGroupId;
    }

    public void setActionGroupId(Integer actionGroupId) {
        this.actionGroupId = actionGroupId;
    }

    public String getActionName() {
        return actionName;
    }

    public void setActionName(String actionName) {
        this.actionName = actionName;
    }

}