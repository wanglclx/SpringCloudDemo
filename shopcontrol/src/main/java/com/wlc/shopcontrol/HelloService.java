package com.wlc.shopcontrol;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: wlc
 * @Date: 2020/4/15 11:03
 * @Description:
 **/
@Service
public class HelloService {
    @Autowired
    RestTemplate restTemplate;

    public String mcdsService(String name) {
        return restTemplate.getForObject("http://MCDSCORE/mcdsService/getString?userNm="+name,String.class);
    }
    public String orderService(String name) {
        return restTemplate.getForObject("http://ORDERCORE/getString?userNm="+name,String.class);
    }
}
