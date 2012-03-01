package com.we350z.gplusrss;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.integration.Message;
import org.springframework.integration.MessageChannel;
import org.springframework.integration.support.MessageBuilder;

public class Main {
    public static void main(String args []) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("/rss-integration.xml");

        MessageChannel messageChannel = classPathXmlApplicationContext.getBean("tweets",MessageChannel.class);
        Message<String> msg =MessageBuilder.withPayload("Hello world!").build() ;
        messageChannel.send(msg);

    }
    
}
