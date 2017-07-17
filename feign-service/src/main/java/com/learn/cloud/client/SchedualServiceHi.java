package com.learn.cloud.client;


import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author 王帅
 * @version v1.0
 */
//定义一个feign接口类,通过@ FeignClient（“服务名”），来指定调用哪个服务：
@FeignClient(value = "service-hi")
public interface SchedualServiceHi {

//    @RequestMapping(value = "/hi",method = RequestMethod.GET)
//    String sayHiFromClientOne(@RequestParam(value = "name") String name);

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    String getHello();
}
