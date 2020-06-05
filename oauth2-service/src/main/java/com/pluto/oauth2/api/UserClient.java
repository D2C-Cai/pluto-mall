package com.pluto.oauth2.api;

import com.pluto.oauth2.api.dto.UserDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "upms-service")
public interface UserClient {

    @GetMapping(value = "/test/{username}")
    UserDTO loadUserByUsername(@PathVariable String username);

}
