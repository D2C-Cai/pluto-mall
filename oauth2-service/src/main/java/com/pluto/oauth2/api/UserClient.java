package com.pluto.oauth2.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "upms-service")
public interface UserClient {

    @GetMapping(value = "/upms/user")
    String loadUserByUsername(@RequestParam("username") String username);

}
