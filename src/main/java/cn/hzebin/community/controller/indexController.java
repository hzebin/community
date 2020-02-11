package cn.hzebin.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class indexController {

    @GetMapping("/")
    /**
     * 网站首页
     */
    public String getIndex() {
        return "index";
    }
}
