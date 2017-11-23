package com.l.cloud.Scclient.remoterest;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
/**
 * Sserver 项目 
 *   配置文件中的 
 *   application.yml 中的  
 *      
 *    spring.application.name ：spring-cloud-producer
 * 
 * */
@FeignClient(name= "spring-cloud-producer")//远程服务名，及spring.application.name配置的名称
public interface HelloRemote {
	
	 @RequestMapping(value = "/hello")
	 public String hello(@RequestParam(value = "name") String name);
	 
	 
}
