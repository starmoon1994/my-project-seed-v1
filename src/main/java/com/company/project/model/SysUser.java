//package com.company.project.model;
//
//import com.company.project.support.dbhandler.SysRoleListTypeHandler;
//import tk.mybatis.mapper.annotation.ColumnType;
//
//import javax.persistence.Id;
//import java.util.List;
//
///**
// * 系统用户表
// * Created by hxy on 2018/5/11.
// */
//public class SysUser {
//    @Id
//    private long id;
//    private String username;
//    private String password;
//    // 角色信息
//    @ColumnType(typeHandler = SysRoleListTypeHandler.class)
//    private List<SysRole> roles;
//
//    public SysUser() {
//    }
//
//    public long getId() {
//        return id;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public List<SysRole> getRoles() {
//        return roles;
//    }
//
//    public void setRoles(List<SysRole> roles) {
//        this.roles = roles;
//    }
//}
