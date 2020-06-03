package com.pluto.upms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pluto.upms.api.dto.UserDTO;
import com.pluto.upms.model.UserDO;

public interface UserService extends IService<UserDO> {

    UserDTO loadUserByUsername(String username);

}
