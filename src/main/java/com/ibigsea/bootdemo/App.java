package com.ibigsea.bootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**       
 * 项目名称：demo   
 * 类全名:com.ibigsea.bootdemo.App  
 * 类描述：     
 * 创建人：黄一帆   
 * 创建时间：2017年4月5日 下午12:31:58    
 * 修改备注：  
 * @version  jdk1.6  
 * 
 * Copyright (c) 2017, supermayii@outlook.com All Rights Reserved.     
 */

@SpringBootApplication
@RestController
public class App {

    @RequestMapping("/")
    public String index(){
        
        return "Hello Spring Boot";
    }
    
    public static void main(String[] args){
        SpringApplication.run(App.class, args);
    }
    
}


