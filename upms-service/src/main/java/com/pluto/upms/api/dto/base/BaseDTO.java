package com.pluto.upms.api.dto.base;

import com.pluto.upms.model.base.BaseDO;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public abstract class BaseDTO extends BaseDO {
}
