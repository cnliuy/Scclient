package com.l.cloud.Scclient.controller;


import com.l.cloud.Scclient.remoterest.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ConsumerController {
	
	@Autowired
	HelloRemote HelloRemote;
	
	/**
	 *  http://127.0.0.1:8003/hello/ly
	 *  
	 *  http://127.0.0.1:8003/hello?name=ly
	 * 
	 * */

    @RequestMapping("/hello/{name}")
    public String index(@PathVariable("name") String name) {
    	
    //@RequestMapping("/hello")
    //public String index(@RequestParam String name) {	
    	
    	//System.out.println("---------------in 8003 index");
    	//return "1";
        return HelloRemote.hello(name);
        
    }
}
