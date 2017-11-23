## eureka消费者（消费者、使用者）

* 该 "消费者" 通过 "eureka服务中心"，调用 "eureka微服务"提供者。  
  "eureka微服务" ---https://github.com/cnliuy/Sserver  
  "eureka服务中心" ---https://github.com/cnliuy/Sscenter  
  "eureka消费者" ---本项目   
    
>  当微服务遇到切换地址等情况，"消费者"可以通过 "eureka服务中心" 获取到"服务"改变的消息。  
  
* 启动顺序：  
       第三个启动。端口 8003   
  
* 原理：  
              
> eureka微服务---(注册)---> eureka服务中心 <---(调用)---eureka微服务的使用者  
> (eureka server)&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;(eureka center)&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; (eureka consumer)  
  
  
  
使用的服务注册中心是  
  eureka:  
    client:  
      service-url:  
        defaultZone: http://127.0.0.1:8001/eureka/  
        
微服务都注册到这个地址，供消费者调用，该地址浏览器访问不到什么  
服务注册中心----可视化状态地址是 http://127.0.0.1:8001/  
  
            
        
https://github.com/cnliuy/Scclient.git  

参考：  
  
    
----  
en笔记 搜索：  
关键词  eureka 服务 测试 demo  


