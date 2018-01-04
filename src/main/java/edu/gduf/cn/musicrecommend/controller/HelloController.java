package edu.gduf.cn.musicrecommend.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author guoji_z
 * create on 2018/1/4 19:55
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        return "dsada";
    }
}
