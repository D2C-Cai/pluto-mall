package com.pluto.oauth2.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pluto.oauth2.model.RoleDO;

import java.util.List;

public interface RoleMapper extends BaseMapper<RoleDO> {

    List<String> findRolesByUserId(String userId);

}
