package com.pluto.oauth2.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pluto.oauth2.model.UserDO;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends IService<UserDO>, UserDetailsService {

}
