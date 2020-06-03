package com.pluto.upms.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.pluto.upms.model.base.BaseDO;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@TableName("sys_menu")
@EqualsAndHashCode(callSuper = false)
public class MenuDO extends BaseDO {

    /**
     *
     */
    private String parentId;
    /**
     *
     */
    private String name;
    /**
     *
     */
    private String options;
    /**
     *
     */
    private Integer level;
    /**
     *
     */
    private Integer status;
    /**
     *
     */
    private Integer sort;

}
