package com.wlc.shopcontrol;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: wlc
 * @Date: 2020/4/15 11:02
 * @Description:
 **/
@RestController
public class HelloControler {
    @Autowired
    HelloService helloService;

    @GetMapping(value = "/getName")
    public String getName(@RequestParam String name) {
        return helloService.mcdsService(name);
    }
}
