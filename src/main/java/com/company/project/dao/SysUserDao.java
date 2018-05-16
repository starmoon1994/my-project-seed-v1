package com.company.project.dao;

import com.company.project.model.SysUser;

import java.util.List;

/**
 * Created by hyp-company on 2018/5/11.
 */
public interface SysUserDao {
    List<SysUser> selectUserList();
}
