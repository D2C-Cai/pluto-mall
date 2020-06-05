package com.pluto.oauth2.api.dto.base;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

@Data
@EqualsAndHashCode(callSuper = false)
public abstract class BaseDTO implements Serializable {

    /**
     * 主键ID
     */
    private String id;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 创建人ID
     */
    private String createUser;
    /**
     * 修改时间
     */
    private Date updateTime;
    /**
     * 修改人ID
     */
    private String updateUser;

}
