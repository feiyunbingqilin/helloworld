package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @date 2022/7/31- 22:05
 */
@RestController
@RequestMapping("/hello")
public class Hello {

    @GetMapping("")
    public String hello(){
        System.out.println("hello world");
    return "ok";
    }
}
