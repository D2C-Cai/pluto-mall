package com.pluto.upms.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pluto.upms.mapper.RoleResourceMapper;
import com.pluto.upms.model.RoleResourceDO;
import com.pluto.upms.service.RoleResourceService;
import org.springframework.stereotype.Service;

@Service
public class RoleResourceServiceImpl extends ServiceImpl<RoleResourceMapper, RoleResourceDO> implements RoleResourceService {
}
