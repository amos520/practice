package com.amos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Date: 2019/11/28 21:00
 *
 * @author: amos
 * Description:
 */
@Controller
public class UiController {

    @RequestMapping("/ui")
    String index(){
        return "/hello";
    }
}
