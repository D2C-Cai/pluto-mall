package com.pluto.client.control;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Slf4j
@RestController
@RequestMapping("/client")
public class ClientController {

    public static final String COMMON_SERVER = "common-server";

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @GetMapping("/test")
    public String test() {
        ServiceInstance serviceInstance = loadBalancerClient.choose(COMMON_SERVER);
        log.info("ServiceInstance :{}", serviceInstance);
        String url = serviceInstance.getUri() + "/server/hello?name=" + "tom";
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(url, String.class);
        return "调用 " + url + ", 返回 : " + result;
    }
    
}
