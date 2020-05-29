package com.pluto.server.control;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RefreshScope
@RestController
@RequestMapping("/server")
public class ServerController {

    @Value("${nacos.yaml.age}")
    private String age;

    @GetMapping("/hello")
    public String hello(@RequestParam String name) {
        log.info("invoked name = " + name + " age = " + age);
        return "hello " + name + " age = " + age;
    }

}
