package com.company.project.controller;

import com.company.project.model.SysUser;
import com.company.project.service.SysUserService;
import com.company.project.service.impl.SysUserServiceImpl;
import com.company.project.support.result.Result;
import com.company.project.support.result.ResultGenerator;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 用户角色相关的controller
 * Created by hxy on 2018/5/11.
 */
@RestController
@RequestMapping("/sys")
public class SysUserRoleController {

    @Autowired
    private SysUserServiceImpl sysUserService;

    @GetMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "10") Integer size) {
        PageHelper.startPage(page, size);
        List<SysUser> list = sysUserService.selectUserList();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }

    @RequestMapping("/t")
    @ResponseBody
    public Object temp(){
        return "temp";
    }

}
