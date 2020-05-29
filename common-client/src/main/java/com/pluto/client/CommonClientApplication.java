package com.pluto.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class CommonClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(CommonClientApplication.class, args);
    }

}
