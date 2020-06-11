package com.pluto.gateway.utils;

import java.util.ArrayList;
import java.util.List;

public class ConvertUtils {

    private ConvertUtils() {

    }

    public static <T> List<T> castList(Object obj, Class<T> clazz) {
        List<T> result = new ArrayList<T>();
        for (Object o : (List<?>) obj) {
            result.add(clazz.cast(o));
        }
        return result;
    }

}
