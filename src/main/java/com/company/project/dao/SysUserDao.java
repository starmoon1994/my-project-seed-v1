package com.company.project.dao;

import com.company.project.model.SysUser;

import java.util.List;


public interface SysUserDao {
    List<SysUser> selectUserList();
}
