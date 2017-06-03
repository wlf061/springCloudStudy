package com.wlf.Chapter.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wlf on 2017/6/3.
 */
@RestController
public class HelloControll {

    @RequestMapping("/hello")
    public String index() {
        System.out.println("enter index");
        return "Hello World";
    }
}
