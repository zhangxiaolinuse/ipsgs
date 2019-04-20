package com.autotest.ipsgs.demo.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/demoView")
public class DemoViewController {

    @RequestMapping("/thymeleaf")
    public String testThymeleaf(Map<String,Object> map) {
        map.put("msg", "Hello Thymeleaf");

      //  map.put("userList", demoViewService.testThymeleaf());

        return "test_thymeleaf";
    }

    @RequestMapping("/freemaker")
    public String testFreemaker(Map<String,Object> map) {
        map.put("msg", "Hello freemarker!");
        return "test_freemarker";
    }

    @RequestMapping("/index")
    public String index() {
        return "test_sidebar";
    }

    @RequestMapping("/first")
    public String first() {
        return "index";
    }

    @RequestMapping("/second")
    public String second() {
        return "login";
    }
}