package com.example.DemoSpringCloudStream.events;

import com.example.DemoSpringCloudStream.model.GlobalProgressStream;
import com.example.DemoSpringCloudStream.service.ProgressChannel;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

@Component
public class ProgressSource {

    private static final Logger LOGGER = LoggerFactory.getLogger(ProgressSource.class);
    @Autowired
    public ProgressChannel progressChannel;

    public void testSomeThing(GlobalProgressStream globalProgressStream){
        LOGGER.info("GlobalProgressStream : {}", globalProgressStream.toString());

        try {
            progressChannel.globalProgressStream().send(MessageBuilder.withPayload(new ObjectMapper().writeValueAsString(globalProgressStream)).build());
        } catch (JsonProcessingException e) {
            LOGGER.error("GlobalProgressStream Error : {}", e);
        }
    }

}
