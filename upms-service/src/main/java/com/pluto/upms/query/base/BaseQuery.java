package com.pluto.upms.query.base;

import com.pluto.upms.query.support.OperatorEnum;
import com.pluto.upms.query.support.QueryField;
import lombok.Data;

import java.io.Serializable;

@Data
public abstract class BaseQuery implements Serializable {

    @QueryField
    private String id;

    @QueryField(operator = OperatorEnum.GE, fieldName = "create_time")
    private String createTimeL;

    @QueryField(operator = OperatorEnum.LE, fieldName = "create_time")
    private String createTimeR;

    private long size = 10;

    private long current = 1;

    private String orders = "create_time:desc";

}
