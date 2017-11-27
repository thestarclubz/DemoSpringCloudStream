package com.example.DemoSpringCloudStream.events;

import com.example.DemoSpringCloudStream.service.ProgressChannel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class ProgressSource {

    private static final Logger LOGGER = LoggerFactory.getLogger(ProgressSource.class);

    private ProgressChannel progressChannel;
}
