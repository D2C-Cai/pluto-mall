package com.pluto.oauth2.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.pluto.oauth2.model.base.BaseDO;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@TableName("sys_role")
@EqualsAndHashCode(callSuper = false)
public class RoleDO extends BaseDO {

    /**
     *
     */
    private String code;
    /**
     *
     */
    private String name;

}
