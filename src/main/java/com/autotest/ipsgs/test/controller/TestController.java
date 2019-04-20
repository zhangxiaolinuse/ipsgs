package com.autotest.ipsgs.test.controller;

import com.autotest.ipsgs.test.entity.UserEntity;
import com.autotest.ipsgs.test.service.TestService;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import java.util.List;

@Controller
@RequestMapping(value = "/test")
//@PostMapping(value = "/sendTelegram")  post请求方式
//@GetMapping(value = "/sendTelegram")   get请求方式
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping("/test1")
    public String getUserList(){
        List<UserEntity> list = testService.getListForUserEntity();
//        JSONObject js = JSONObject.fromObject(list);

        JSONArray jslist = JSONArray.fromObject(list);
        return "../public/index";
//        return jslist.toString();
    }

    @RequestMapping("/test2")
    @ResponseBody
    public String getUserList2(){
        List<UserEntity> list = testService.getList2ForUserEntity();
        JSONArray jslist = JSONArray.fromObject(list);
        System.out.println("tests2dfafdasfdfdsa312321dfdsafdas111");
        return jslist.toString();
    }
}
