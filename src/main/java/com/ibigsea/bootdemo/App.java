package com.ibigsea.bootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**       
 * ��Ŀ���ƣ�demo   
 * ��ȫ��:com.ibigsea.bootdemo.App  
 * ��������     
 * �����ˣ���һ��   
 * ����ʱ�䣺2017��4��5�� ����12:31:58    
 * �޸ı�ע��  
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


