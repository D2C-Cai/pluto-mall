package com.pluto.upms.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pluto.upms.mapper.MenuMapper;
import com.pluto.upms.model.MenuDO;
import com.pluto.upms.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuServiceImpl extends ServiceImpl<MenuMapper, MenuDO> implements MenuService {

    @Autowired
    private MenuMapper menuMapper;

    @Override
    public List<MenuDO> findMenusByUserId(String userId) {
        return menuMapper.findMenusByUserId(userId);
    }

}
