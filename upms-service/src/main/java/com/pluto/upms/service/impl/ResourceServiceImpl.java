package com.pluto.upms.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pluto.upms.mapper.ResourceMapper;
import com.pluto.upms.model.ResourceDO;
import com.pluto.upms.service.ResourceService;
import org.springframework.stereotype.Service;

@Service
public class ResourceServiceImpl extends ServiceImpl<ResourceMapper, ResourceDO> implements ResourceService {
}
