package com.example.gdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
    /**
     * 项目启动，默认跳转根目录
     * @return
     */
    @RequestMapping("/test")
    @ResponseBody
    public String index() {
        return "index";
    }
}
