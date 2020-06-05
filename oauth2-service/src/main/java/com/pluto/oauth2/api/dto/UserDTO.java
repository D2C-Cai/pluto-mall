package com.pluto.oauth2.api.dto;

import com.pluto.oauth2.api.dto.base.BaseDTO;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper = false)
public class UserDTO extends BaseDTO {

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
    /**
     *
     */
    private List<String> roles;

}
