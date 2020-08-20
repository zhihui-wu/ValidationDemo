package com.luckysrm.validation.common.annotation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;

/**
 * @Description: 是否存在枚举值 校验器
 * @Author: 吴智慧
 * @Date: 2020/7/30 11:23
 */
public class ExistEnumValidator implements ConstraintValidator<ExistEnum, Object> {

    private Class<?> type;

    private String key;

    private final static String PREFIX = "get";

    @Override
    public void initialize(ExistEnum constraintAnnotation) {
        key = constraintAnnotation.key();
        type = constraintAnnotation.type();
    }

    @Override
    public boolean isValid(Object value, ConstraintValidatorContext context) {
        if (!type.isEnum()){
            throw new RuntimeException("指定校验域不是枚举");
        }
        Object[] innerEnum = type.getEnumConstants();
        if (innerEnum.length <= 0 || value == null) {
            return true;
        }
        try {
            Method method = type.getDeclaredMethod(PREFIX + upCaseInitial(key));
            for (Object enumObject : innerEnum) {
                Object result = method.invoke(enumObject, null);
                if (Objects.equals(value, result)) {
                    return true;
                }
            }
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
        return false;
    }

    /**
     * 转换为首字母大写
     * @param s 字符串
     * @return 首字母大写的字符串
     */
    private String upCaseInitial(String s) {
        if (Character.isUpperCase(s.charAt(0))){
            return s;
        }else {
            return Character.toUpperCase(s.charAt(0)) + s.substring(1);
        }
    }
}
