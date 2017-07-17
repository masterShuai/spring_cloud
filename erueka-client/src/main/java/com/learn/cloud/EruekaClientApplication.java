package com.learn.cloud;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient //表明自己是一个eurekaclient
@RestController
public class EruekaClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(EruekaClientApplication.class, args);
	}

	@Value("${server.port}")
	String port;
	@RequestMapping("/hi")
	public String home(@RequestParam String name) {
		return "hi "+name+",i am from port:" +port;
	}

	@RequestMapping("/hello")
	public String sayHello(@RequestParam String name) {
		return "hello,i am from port:" +port;
	}

}
