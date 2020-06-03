package com.pluto.upms.handler;

import com.pluto.upms.api.Metadata;
import com.pluto.upms.mapper.ResourceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.AntPathMatcher;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

@Component
public class InitMetadataSourceHandler {

    @Autowired
    private ResourceMapper resourceMapper;

    // 全局{URL->ROLE[]}的TreeMap元数据缓存
    private TreeMap<String, List<String>> resourceRolesMap = new TreeMap<>();

    private AntPathMatcher antPathMatcher = new AntPathMatcher();

    @PostConstruct
    public void initMetadataCache() {
        List<Metadata> list = resourceMapper.findSecurityMetadata();
        for (Metadata item : list) {
            String resourceUrl = item.getResourceUrl();
            List<String> roleList = resourceRolesMap.computeIfAbsent(resourceUrl, k -> new ArrayList<>());
            roleList.add(item.getRoleCode());
        }
    }

}
