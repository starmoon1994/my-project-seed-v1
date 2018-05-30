package com.company.project.controller;

import com.company.project.mapper.CountryMapper;
import com.company.project.model.Country;
//import com.company.project.model.SysUser;
import com.company.project.support.result.ResultGenerator;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/")
public class TempController extends AbstractController{

    private static final Logger logger = LoggerFactory.getLogger(TempController.class);

    @RequestMapping("/t")
    @ResponseBody
    public Object temp() {
        return "temp";
    }

    @RequestMapping("/")
    @ResponseBody
    public Object all() {
        return "welcome to here！";
    }

    @RequestMapping("/testlog")
    @ResponseBody
    public Object testlog() {
        logger.debug("this is debug");
        logger.info("this is info");
        logger.warn("this is warn");
        logger.error("this is error");

        return "log";
    }

    @Autowired
    private CountryMapper countryMapper;

    @RequestMapping("/testcountry")
    @ResponseBody
    public Object temp2() {
        PageHelper.startPage(1, 100);
        List<Country> list = countryMapper.selectAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }

    @RequestMapping("/selectByCountryName")
    @ResponseBody
    public Object selectByCountryName(@RequestParam(defaultValue = "测试",required = false)String name) {
        Country country = countryMapper.selectByCountryName(name);
        return ResultGenerator.genSuccessResult(country);
    }

    @RequestMapping("/selectByCountryName2")
    @ResponseBody
    public Object selectByCountryName2(@RequestParam(defaultValue = "测试",required = false)String name) {
        Country country = countryMapper.selectByCountryName2(name);
        return ResultGenerator.genSuccessResult(country);
    }
}
