package com.pluto.upms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pluto.upms.model.MenuDO;

import java.util.List;

public interface MenuService extends IService<MenuDO> {

    List<MenuDO> findMenusByUserId(String userId);

}
