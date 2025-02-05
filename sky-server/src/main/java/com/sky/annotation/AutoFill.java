package com.sky.annotation;

import com.sky.enumeration.OperationType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)// 注解只能标注在方法上
@Retention(RetentionPolicy.RUNTIME)// 注解在运行时生效
public @interface AutoFill {
    OperationType value();// 注解的值是 OperationType 枚举类型
}
