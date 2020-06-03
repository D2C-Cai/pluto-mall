package com.pluto.upms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pluto.upms.api.Metadata;
import com.pluto.upms.model.ResourceDO;

import java.util.List;

public interface ResourceMapper extends BaseMapper<ResourceDO> {

    List<Metadata> findSecurityMetadata();

}
