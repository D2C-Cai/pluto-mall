package com.pluto.oauth2.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pluto.oauth2.mapper.UserRoleMapper;
import com.pluto.oauth2.model.UserRoleDO;
import com.pluto.oauth2.service.UserRoleService;
import org.springframework.stereotype.Service;

@Service
public class UserRoleServiceImpl extends ServiceImpl<UserRoleMapper, UserRoleDO> implements UserRoleService {
}
