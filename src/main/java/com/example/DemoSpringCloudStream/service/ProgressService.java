package com.example.DemoSpringCloudStream.service;

import com.example.DemoSpringCloudStream.events.ProgressSource;
import com.example.DemoSpringCloudStream.model.GlobalProgressStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.stereotype.Service;

@Service
@EnableBinding(ProgressSource.class)
public class ProgressService {

    @Autowired
    private ProgressSource progressSource;

    public GlobalProgressStream test(GlobalProgressStream globalProgressStream) {
        progressSource.testSomeThing(globalProgressStream);
        return globalProgressStream;
    }
}
