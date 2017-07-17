package com.learn.cloud.client;


import feign.RequestLine;
import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * @author 王帅
 * @version v1.0
 */
//定义一个feign接口类,通过@ FeignClient（“服务名”），来指定调用哪个服务：
@FeignClient(value = "service-hi")
public interface SchedualServiceHi {

//    @RequestMapping(value = "/hi",method = RequestMethod.GET)
//    String sayHiFromClientOne(@RequestParam(value = "name") String name);

//    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    @RequestLine("GET /hello")
    String getHello();
}
