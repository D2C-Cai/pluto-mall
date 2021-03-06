package com.pluto.oauth2.config;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "com.pluto.oauth2.api")
public class OpenFeignConfig {
}
