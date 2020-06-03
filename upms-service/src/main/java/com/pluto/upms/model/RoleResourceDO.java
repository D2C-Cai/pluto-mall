package com.pluto.upms.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.pluto.upms.model.base.BaseDO;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@TableName("sys_role_resource")
@EqualsAndHashCode(callSuper = false)
public class RoleResourceDO extends BaseDO {

    /**
     *
     */
    private String roleId;
    /**
     *
     */
    private String resourceId;

}
