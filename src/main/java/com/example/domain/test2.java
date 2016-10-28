package com.example.domain;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Yang Jian on 2016/10/27.
 */
@RestController
public class test2 {
    @RequestMapping("/test")
    public String test(){
        return "test";
    }


}

