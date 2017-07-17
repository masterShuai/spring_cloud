package com.learn.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient //向服务中心注册
@EnableHystrix //允许断路器
public class RibbonBalancerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RibbonBalancerApplication.class, args);
	}

	@Bean
	@LoadBalanced //表明这个bean是负载均衡的。
	RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
