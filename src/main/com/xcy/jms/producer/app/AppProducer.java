package com.xcy.jms.producer.app;

import com.xcy.jms.producer.ProducerService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author xcy
 * @Description
 * @Date 2018/9/27 22:27
 * @Version 1.0
 */
public class AppProducer {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("producer.xml");
        ProducerService service = context.getBean(ProducerService.class);
        for (int i = 10; i < 20; i++) {
            service.sendMessage("发送第 " + i + " 条消息");
        }
        //关闭连接
        context.close();
    }

}
