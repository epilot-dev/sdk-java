package dev.epilot.sdk.utils;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public enum Types {
    PRIMITIVE,
    ARRAY,
    MAP,
    OBJECT,
    ENUM;

    private static final Set<Class<?>> PRIMITIVE_TYPES = getPrimitiveWrapperTypes();

    public static Types getType(Class<?> clazz) {
        if (clazz.isArray()) {
            return Types.ARRAY;
        } else if (Map.class.isAssignableFrom(clazz)) {
            return Types.MAP;
        } else if (clazz.isEnum()) {
            return Types.ENUM;
        } else if (isPrimitiveWrapperTypes(clazz) || clazz.isPrimitive() || String.class.isAssignableFrom(clazz)) {
            return Types.PRIMITIVE;
        } else {
            return Types.OBJECT;
        }
    }

    private static boolean isPrimitiveWrapperTypes(Class<?> clazz) {
        return PRIMITIVE_TYPES.contains(clazz);
    }

    private static Set<Class<?>> getPrimitiveWrapperTypes() {
        Set<Class<?>> ret = new HashSet<Class<?>>();
        ret.add(Boolean.class);
        ret.add(Character.class);
        ret.add(Byte.class);
        ret.add(Short.class);
        ret.add(Integer.class);
        ret.add(Long.class);
        ret.add(Float.class);
        ret.add(Double.class);
        ret.add(Void.class);
        return ret;
    }
}