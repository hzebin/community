package cn.hzebin.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
    @GetMapping("/hello")
    public String helloMethod(@RequestParam(name = "name") String name, Model model) {
        model.addAttribute("name", name);  //将左边绑给左边的变量
        return "hello";  //在template里面找模板
    }
}
