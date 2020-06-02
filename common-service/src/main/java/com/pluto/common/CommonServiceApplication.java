package com.pluto.common;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class CommonServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CommonServiceApplication.class, args);
    }

}
