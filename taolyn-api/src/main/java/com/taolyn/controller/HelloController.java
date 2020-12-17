package com.taolyn.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

/**
 * Created by 陶Lyn
 * on 2020/11/23.
 */
@ApiIgnore
@RestController
public class HelloController {
    @GetMapping("/hello")
    public Object hello(){
        return "Hello World";
    }
}
