package com.pluto.oauth2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class Oauth2ServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(Oauth2ServiceApplication.class, args);
    }

}
