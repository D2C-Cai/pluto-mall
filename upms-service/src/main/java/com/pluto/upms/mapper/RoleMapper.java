package com.pluto.upms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pluto.upms.model.RoleDO;

import java.util.List;

public interface RoleMapper extends BaseMapper<RoleDO> {

    List<String> findRolesByUserId(String userId);

}
