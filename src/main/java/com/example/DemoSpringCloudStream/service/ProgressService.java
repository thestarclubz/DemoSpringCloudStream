package com.example.DemoSpringCloudStream.service;

import com.example.DemoSpringCloudStream.events.ProgressSource;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.stereotype.Service;

@Service
@EnableBinding(ProgressSource.class)
public class ProgressService {
}
