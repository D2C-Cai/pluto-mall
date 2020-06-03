package com.pluto.upms.query.support;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target(FIELD)
@Retention(RUNTIME)
public @interface QueryField {

    /**
     * 查询条件
     *
     * @return
     */
    OperatorEnum operator() default OperatorEnum.EQ;

    /**
     * 查询字段
     *
     * @return
     */
    String fieldName() default "";

}