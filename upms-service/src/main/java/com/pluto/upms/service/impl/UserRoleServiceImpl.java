package com.pluto.upms.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pluto.upms.mapper.UserRoleMapper;
import com.pluto.upms.model.UserRoleDO;
import com.pluto.upms.service.UserRoleService;
import org.springframework.stereotype.Service;

@Service
public class UserRoleServiceImpl extends ServiceImpl<UserRoleMapper, UserRoleDO> implements UserRoleService {
}
