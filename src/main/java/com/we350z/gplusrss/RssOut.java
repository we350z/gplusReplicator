package com.we350z.gplusrss;

import com.sun.syndication.feed.synd.SyndEntryImpl;
import org.springframework.integration.Message;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.util.Map;

@Component
public class RssOut {
    public void shitter(Message <SyndEntryImpl> msg) {
        System.out.println( "===========================================");
        SyndEntryImpl payload = msg.getPayload();
        Map<String, Object> headers = msg.getHeaders();
        System.out.println(payload.getPublishedDate()  + " : "+ payload.getTitle());

        for (String key : headers.keySet()) {
            System.out.println(key + "=" + headers.get(key));
        }
    }
}
