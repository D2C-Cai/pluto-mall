package com.pluto.oauth2.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pluto.oauth2.mapper.RoleMapper;
import com.pluto.oauth2.model.RoleDO;
import com.pluto.oauth2.service.RoleService;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, RoleDO> implements RoleService {
}
