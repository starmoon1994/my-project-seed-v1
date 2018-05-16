package com.company.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/temp")
public class TempController {

    @RequestMapping("/t")
    @ResponseBody
    public Object temp(){
        return "temp";
    }
}
