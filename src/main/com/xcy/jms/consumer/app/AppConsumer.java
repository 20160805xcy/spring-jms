package com.xcy.jms.consumer.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author xcy
 * @Description
 * @Date 2018/9/27 23:01
 * @Version 1.0
 */
public class AppConsumer {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
    }
    
}
