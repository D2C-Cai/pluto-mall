package com.pluto.upms.api.dto;

import com.pluto.upms.model.UserDO;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.beans.BeanUtils;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper = false)
public class UserDTO extends UserDO {

    private List<String> roles;

    public UserDTO() {

    }

    public UserDTO(UserDO user) {
        if (user != null) {
            BeanUtils.copyProperties(user, this);
        }
    }

}
