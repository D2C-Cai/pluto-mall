package com.pluto.upms.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.pluto.upms.model.base.BaseDO;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@TableName("sys_resource")
@EqualsAndHashCode(callSuper = false)
public class ResourceDO extends BaseDO {

    /**
     *
     */
    private String name;
    /**
     *
     */
    private String url;
    /**
     *
     */
    private Integer status;
    /**
     *
     */
    private Integer sort;

}
