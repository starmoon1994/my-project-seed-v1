package com.company.project.model;

/**
 * 用户角色关系表
 * Created by hxy on 2018/5/11.
 */
public class SysUserRole {

    private long id;
    private long sysUserId;
    private long rolesId;

    public SysUserRole() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getSysUserId() {
        return sysUserId;
    }

    public void setSysUserId(long sysUserId) {
        this.sysUserId = sysUserId;
    }

    public long getRolesId() {
        return rolesId;
    }

    public void setRolesId(long rolesId) {
        this.rolesId = rolesId;
    }
}
