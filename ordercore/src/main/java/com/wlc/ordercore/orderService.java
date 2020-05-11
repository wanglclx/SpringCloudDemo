package com.wlc.ordercore;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: wlc
 * @Date: 2020/4/13 16:24
 * @Description:
 **/
@RestController
@RequestMapping("/orderService")
public class orderService {

        @RequestMapping("/getInfo")
        public String getDemoInfo(){
            return "this is a provider service";
        }

        @RequestMapping("/getString")
        public String getString(String userNm){
            return userNm+",你好！8802";
        }
}
