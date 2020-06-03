package com.pluto.upms.api;

import lombok.Data;

import java.io.Serializable;

/**
 * 元数据单元DTO
 */
@Data
public class Metadata implements Serializable {

    /**
     * 接口URL
     */
    String resourceUrl;
    /**
     * URL对应的ROLE
     */
    String roleCode;

}
