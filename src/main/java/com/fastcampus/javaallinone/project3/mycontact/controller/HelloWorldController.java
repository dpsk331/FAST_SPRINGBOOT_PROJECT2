package com.fastcampus.javaallinone.project3.mycontact.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

// @Controller
// @ResponseBody

// 아래의 애노테이션으로 위의 두 가지 애노테이션 치환 가능!
@RestController
public class HelloWorldController {

    @GetMapping(value = "/api/helloWorld")
    public String helloWorld() {
        return "HelloWorld";
    }

}
