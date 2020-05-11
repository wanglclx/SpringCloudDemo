package com.wlc.mcdscore;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: wlc
 * @Date: 2020/4/13 16:24
 * @Description:
 **/
@RestController
@RequestMapping("/mcdsService")
public class mcdsService {

        @RequestMapping("/getInfo")
        public String getDemoInfo(){
            return "this is a provider service";
        }

        @RequestMapping("/getString")
        public String getString(String userNm){
            System.out.println(userNm+",你好！8804");
            return userNm+",你好！8804";
        }
}
