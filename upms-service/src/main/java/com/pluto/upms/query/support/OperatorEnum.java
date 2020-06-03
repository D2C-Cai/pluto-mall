package com.pluto.upms.query.support;

/**
 * 查询条件
 */
public enum OperatorEnum {

    EQ("等于="),
    NE("不等于<>"),
    GT("大于>"),
    GE("大于等于>="),
    LT("小于<"),
    LE("小于等于<="),
    LIKE("模糊查询 LIKE"),
    NOT_LIKE("模糊查询 NOT LIKE"),
    IN("IN 查询"),
    NOT_IN("NOT IN 查询"),
    IS_NULL("NULL 值查询"),
    IS_NOT_NULL("IS NOT NULL");

    private String description;

    OperatorEnum(String description) {
        this.description = description;
    }
}