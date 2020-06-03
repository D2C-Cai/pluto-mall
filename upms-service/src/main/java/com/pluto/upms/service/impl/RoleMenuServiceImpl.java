package com.pluto.upms.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pluto.upms.mapper.RoleMenuMapper;
import com.pluto.upms.model.RoleMenuDO;
import com.pluto.upms.service.RoleMenuService;
import org.springframework.stereotype.Service;

@Service
public class RoleMenuServiceImpl extends ServiceImpl<RoleMenuMapper, RoleMenuDO> implements RoleMenuService {
}
