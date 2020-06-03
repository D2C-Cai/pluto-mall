package com.pluto.upms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pluto.upms.model.MenuDO;

import java.util.List;

public interface MenuMapper extends BaseMapper<MenuDO> {

    List<MenuDO> findMenusByUserId(String userId);

}
