package com.wlc.dscontrol;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: wlc
 * @Date: 2020/4/15 14:38
 * @Description:
 **/
@RestController
public class DsController {

    @Autowired
    IMcdsService mcdsService;

    @GetMapping(value = "/getString")
    public String getString(@RequestParam String name) {
        return mcdsService.getString(name);
    }
}
