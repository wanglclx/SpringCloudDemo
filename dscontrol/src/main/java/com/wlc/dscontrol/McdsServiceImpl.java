package com.wlc.dscontrol;

import org.springframework.stereotype.Component;

/**
 * @Author: wlc
 * @Date: 2020/4/16 19:35
 * @Description:
 **/
@Component
public class McdsServiceImpl implements IMcdsService {

    @Override
    public String getString(String name) {
        return "Hystrix work, sorry:" + name;
    }
}
