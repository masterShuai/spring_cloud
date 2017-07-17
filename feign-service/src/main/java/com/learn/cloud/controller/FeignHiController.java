package com.learn.cloud.controller;

import com.learn.cloud.client.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 王帅
 * @version v1.0
 */
@RestController
public class FeignHiController {
    @Autowired
    private SchedualServiceHi schedualServiceHi;

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String sayHi(@RequestParam final String name){
        return schedualServiceHi.sayHiFromClientOne(name);
    }
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String sayHello(@RequestParam final String name) {
        return schedualServiceHi.getHello();
    }
}
