package com.example.practice.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @program: practice
 * @Date: 2019/3/6 23:11
 * @Author: Yi.Liu
 * @Description:
 */
@RestController
public class TopController {

    private Object lock1 = new Object();
    private Object lock2 = new Object();
    public static boolean flag = true;


    String index(){
        return "hello world!!!";
    }
    /**
     * 死循环
     */

    @RequestMapping("loop")
    void loop(String cmd) {

        if ("stop".equals(cmd)) {
            flag = false;
        } else {
            flag = true;
        }
        while (flag) {
            System.out.println("random:" + Math.random());
        }
    }



    @GetMapping("version")
    String version() {
        Map<String, Object> map = new LinkedHashMap<>();
        InetAddress address = InetAddress.getLoopbackAddress();

        map.put("获取本机的IP地址：", address.getHostAddress());
        map.put("java版本号：", System.getProperty("java.version"));
        map.put("Java提供商名称：", System.getProperty("java.vendor"));
        map.put("jre目录：", System.getProperty("java.home"));
        map.put("Java虚拟机规范版本号：", System.getProperty("java.vm.specification.version"));
        map.put("Java虚拟机版本号：", System.getProperty("java.vm.version"));
        map.put("Java虚拟机提供商：", System.getProperty("java.vm.vendor"));
        map.put("Java虚拟机名称：", System.getProperty("java.vm.name"));
        map.put("操作系统名称：", System.getProperty("os.name"));
        map.put("操作系统的架构：", System.getProperty("os.arch"));
        map.put("操作系统版本号：", System.getProperty("os.version"));
        map.put("操作系统用户名：", System.getProperty("user.name"));
        map.put("操作系统用户的主目录：", System.getProperty("user.home"));
        map.put("当前程序所在目录：", System.getProperty("user.dir"));
        System.out.println(map.toString());
        return map.toString();

    }
}
