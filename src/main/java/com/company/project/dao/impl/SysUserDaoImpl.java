package com.company.project.dao.impl;

import com.company.project.dao.SysUserDao;
import com.company.project.mapper.SysUserMapper;
import com.company.project.model.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 1
 * Created by hyp-company on 2018/5/11.
 */
@Repository
public class SysUserDaoImpl implements SysUserDao{

    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public List<SysUser> selectUserList() {
        return sysUserMapper.selectUserList();
    }
}
