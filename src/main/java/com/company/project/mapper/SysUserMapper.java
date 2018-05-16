package com.company.project.mapper;

import com.company.project.model.SysUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 1
 * Created by hyp-company on 2018/5/11.
 */
public interface SysUserMapper {
    List<SysUser> selectUserList();
}
