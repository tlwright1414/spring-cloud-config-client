package com.trta.contenttech.springcloudconfigclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class MyController {

    @Value("${test.git.message}")
    String message;

    @Value("${test.git.level}")
    String level;

    @Value("${test.git.password}")
    String password;

//    @Value("${test.git.env}")
//    String env;

    @RequestMapping(value="/props", method = RequestMethod.GET)
    public String getProps(){
        Map<String, String> propsMap = new HashMap<String,String>();
        propsMap.put("test.git.message", message);
        propsMap.put("test.git.level", level);
        propsMap.put("test.git.password", password);
//        propsMap.put("test.git.env", env);
        return propsMap.toString();
    }
}