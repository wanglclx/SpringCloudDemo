package com.wlc.ordercore;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: wlc
 * @Date: 2020/4/15 14:35
 * @Description:
 **/
@FeignClient(value = "mcdsCore")
public interface IMcdsService {

    @RequestMapping(value = "/mcdsService/getString",method = RequestMethod.GET)
    String getString(@RequestParam(value = "userNm") String name);

}
