package com.haha.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author huangzd
 * @Date 2018/12/20 15:01
 */
@RestController
public class HelloController {
    /** 
    * @Param: [] 
    * @return: java.lang.String 
    * @Author: huangzd
    * @Date: 2018/12/20 
    */
    @RequestMapping("/hello")
    public String index() {
        return "Hellotest";
    }
}
