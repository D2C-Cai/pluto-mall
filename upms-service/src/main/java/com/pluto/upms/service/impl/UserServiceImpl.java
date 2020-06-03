package com.pluto.upms.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pluto.upms.api.dto.UserDTO;
import com.pluto.upms.mapper.RoleMapper;
import com.pluto.upms.mapper.UserMapper;
import com.pluto.upms.model.UserDO;
import com.pluto.upms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, UserDO> implements UserService {

    @Autowired
    private RoleMapper roleMapper;

    @Override
    public UserDTO loadUserByUsername(String username) {
        QueryWrapper<UserDO> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().eq(UserDO::getUsername, username);
        UserDO user = this.getOne(queryWrapper);
        if (user == null) {
            return null;
        }
        List<String> roles = roleMapper.findRolesByUserId(user.getId());
        UserDTO userDTO = new UserDTO(user);
        userDTO.setRoles(roles);
        return userDTO;
    }

}
