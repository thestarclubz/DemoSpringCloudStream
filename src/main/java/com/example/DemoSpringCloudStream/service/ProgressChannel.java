package com.example.DemoSpringCloudStream.service;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.SubscribableChannel;
import org.springframework.stereotype.Component;

@Component
public interface ProgressChannel {

    String GLOBAL_PROGRESS_STREAM = "GlobalProgressStream";

    @Output(ProgressChannel.GLOBAL_PROGRESS_STREAM)
    SubscribableChannel globalProgressStream();
}
