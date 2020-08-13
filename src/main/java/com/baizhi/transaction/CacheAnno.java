package com.baizhi.transaction;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface CacheAnno {
    String key();
    int index();
    Class targetClass();
    CACHE_TYPE cacheType() default CACHE_TYPE.FIND;
    enum CACHE_TYPE {
        FIND,
        UPDATE
    }
}
