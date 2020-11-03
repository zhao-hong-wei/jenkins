package com.dj.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zhw
 */
@Controller
public class UserController {

    @RequestMapping("test")
    public String test(){
        return "test";
    }

}
