package com.pluto.upms.query.support;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.pluto.upms.model.base.BaseDO;
import com.pluto.upms.query.base.BaseQuery;
import org.springframework.util.StringUtils;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 查询条件解析器
 */
public class QueryResolver {

    /**
     * 构建单表查询条件
     *
     * @param query
     * @param <T>
     * @param <Q>
     * @return
     */
    public static <T extends BaseDO, Q extends BaseQuery> QueryWrapper<T> buildQuery(Q query) {
        QueryWrapper<T> queryWrapper = new QueryWrapper<>();
        for (Field field : getAllFields(query.getClass())) {
            field.setAccessible(true);
            // 查询字段标签
            QueryField annotation = field.getAnnotation(QueryField.class);
            if (annotation == null) {
                continue;
            }
            // 查询字段名称
            String name = annotation.fieldName();
            if (StringUtils.isEmpty(name)) {
                name = camelToUnderline(field.getName());
            }
            // 查询字段的值（单个）
            Object value;
            try {
                value = field.get(query);
            } catch (IllegalAccessException e) {
                break;
            }
            // 查询字段的值（数组）
            Object[] values = new Object[]{};
            if (value != null && value.getClass().isArray()) {
                values = (Object[]) value;
            }
            // 根据查询条件构造predicates
            switch (annotation.operator()) {
                case EQ:
                    if (value != null) {
                        queryWrapper.eq(name, value);
                    }
                    break;
                case NE:
                    if (value != null) {
                        queryWrapper.ne(name, value);
                    }
                    break;
                case GE:
                    if (value != null) {
                        queryWrapper.ge(name, value);
                    }
                    break;
                case GT:
                    if (value != null) {
                        queryWrapper.gt(name, value);
                    }
                    break;
                case LE:
                    if (value != null) {
                        queryWrapper.le(name, value);
                    }
                    break;
                case LT:
                    if (value != null) {
                        queryWrapper.lt(name, value);
                    }
                    break;
                case LIKE:
                    if (value != null) {
                        queryWrapper.like(name, value);
                    }
                    break;
                case NOT_LIKE:
                    if (value != null) {
                        queryWrapper.notLike(name, value);
                    }
                    break;
                case IN:
                    if (values.length > 0) {
                        queryWrapper.in(name, values);
                    }
                    break;
                case NOT_IN:
                    if (values.length > 0) {
                        queryWrapper.notIn(name, values);
                    }
                    break;
                case IS_NULL:
                    if (value != null && (int) value == 1) {
                        queryWrapper.isNull(name);
                    }
                    break;
                case IS_NOT_NULL:
                    if (value != null && (int) value == 1) {
                        queryWrapper.isNotNull(name);
                    }
                    break;
                default:
                    break;
            }
        }
        return queryWrapper;
    }

    /**
     * 获取基类和父类所有的字段
     *
     * @param clazz
     * @return
     */
    private static Field[] getAllFields(Class<?> clazz) {
        List<Field> fieldList = new ArrayList<>();
        while (clazz != null) {
            fieldList.addAll(new ArrayList<>(Arrays.asList(clazz.getDeclaredFields())));
            clazz = clazz.getSuperclass();
        }
        Field[] fields = new Field[fieldList.size()];
        fieldList.toArray(fields);
        return fields;
    }

    /**
     * 字段名称驼峰转下划线
     *
     * @param param
     * @return
     */
    private static String camelToUnderline(String param) {
        if (param == null || "".equals(param.trim())) {
            return "";
        }
        int len = param.length();
        StringBuilder sb = new StringBuilder(len);
        for (int i = 0; i < len; i++) {
            char c = param.charAt(i);
            if (Character.isUpperCase(c)) {
                sb.append('_');
                sb.append(Character.toLowerCase(c));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

}
