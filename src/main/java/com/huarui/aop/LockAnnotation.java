package com.huarui.aop;

import java.lang.annotation.*;

/**
 * 自定义注解
 * Created by lihui on 2019/1/15.
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface LockAnnotation {

}