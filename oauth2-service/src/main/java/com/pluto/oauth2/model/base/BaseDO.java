package com.pluto.oauth2.model.base;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public abstract class BaseDO implements Serializable {

    /**
     * 主键ID
     */
    @TableId(type = IdType.AUTO)
    private String id;
    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;
    /**
     * 创建人ID
     */
    @TableField(fill = FieldFill.INSERT)
    private String createUser;
    /**
     * 修改时间
     */
    @TableField(fill = FieldFill.UPDATE)
    private Date updateTime;
    /**
     * 修改人ID
     */
    @TableField(fill = FieldFill.UPDATE)
    private String updateUser;

}
