package com.example.practice.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: practice
 * @Date: 2019/3/6 23:11
 * @Author: Yi.Liu
 * @Description:
 */
@RestController
public class TopController {
    @GetMapping()
    String index() {
        return "hello world!!!"+Math.random();
    }

}
