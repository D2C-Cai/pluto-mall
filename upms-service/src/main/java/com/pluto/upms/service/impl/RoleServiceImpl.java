package com.pluto.upms.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pluto.upms.mapper.RoleMapper;
import com.pluto.upms.model.RoleDO;
import com.pluto.upms.service.RoleService;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, RoleDO> implements RoleService {
}
