package com.amos.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Date: 2019/12/2 20:31
 *
 * @author: amos
 * Description:
 */
@RestController
public class ApiController {

    @RequestMapping("/api")
    public String index() {
        return "api";
    }

}
