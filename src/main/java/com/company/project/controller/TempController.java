package com.company.project.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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

    @RequestMapping("/t2")
    @ResponseBody
    public Object temp2() {


        return "temp";
    }
}
