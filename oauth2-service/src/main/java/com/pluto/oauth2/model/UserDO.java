package com.pluto.oauth2.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.pluto.oauth2.model.base.BaseDO;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@TableName("sys_user")
@EqualsAndHashCode(callSuper = false)
public class UserDO extends BaseDO {

    /**
     *
     */
    private String username;
    /**
     *
     */
    private String password;
    /**
     *
     */
    private String nickname;
    /**
     *
     */
    private String avatar;
    /**
     *
     */
    private Integer status;

}
