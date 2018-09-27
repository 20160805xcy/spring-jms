package com.xcy.jms.consumer;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/**
 * @Author xcy
 * @Description
 * @Date 2018/9/27 22:53
 * @Version 1.0
 */
public class ConsumerMessageListener implements MessageListener{
    public void onMessage(Message message) {
        TextMessage textMessage = (TextMessage) message;
        try {
            System.out.println("接收到消息: " + textMessage.getText());
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }
}
