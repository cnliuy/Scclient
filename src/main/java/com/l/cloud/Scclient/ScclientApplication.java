package com.l.cloud.Scclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
/**
 * 调用 eureka服务提供者的消费客户端
 * */
@EnableDiscoveryClient //启用服务注册与发现
@EnableFeignClients  //启用feign进行远程调用
public class ScclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScclientApplication.class, args);
	}
}
