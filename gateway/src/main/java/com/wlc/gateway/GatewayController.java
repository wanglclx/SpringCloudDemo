package com.wlc.gateway;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: wlc
 * @Date: 2020/4/25 19:15
 * @Description:
 **/
@RestController
public class GatewayController {
    @RequestMapping(value = "/fallback")
    public String fallback(){
        return "fallback nothing-->wlc";
    }

}
