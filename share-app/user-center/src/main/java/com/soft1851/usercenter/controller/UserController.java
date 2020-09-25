package com.soft1851.usercenter.controller;

import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.rmi.runtime.Log;

/**
 * @author tengf
 * @Description:
 * @date: 2020/9/23 8:39
 */
@RestController
@RequestMapping(value = "/user")
@Slf4j
public class UserController {
    @GetMapping(value = "/hello")
    public String getHello() {
        log.info("我被调用了");
        return "hello user-center!";
    }
}
