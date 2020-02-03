package com.example.gdemo.controller;

@Controller
public class TestController {
    /**
     * 项目启动，默认跳转根目录
     * @return
     */
    @RequestMapping("/test")
    public String index() {
        return "index";
    }
}
