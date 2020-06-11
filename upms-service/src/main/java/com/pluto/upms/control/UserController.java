package com.pluto.upms.control;

import com.pluto.upms.api.dto.UserDTO;
import com.pluto.upms.control.base.BaseController;
import com.pluto.upms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/upms")
public class UserController extends BaseController {

    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public UserDTO loadUserByUsername(@RequestParam("username") String username) {
        return userService.loadUserByUsername(username);
    }

}
