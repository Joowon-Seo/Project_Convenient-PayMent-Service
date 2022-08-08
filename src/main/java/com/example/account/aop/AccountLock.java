package com.example.account.aop;

import java.lang.annotation.*;

@Target(ElementType.METHOD)// annotation을 붙일 수 있는 타입
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface AccountLock {
    long tryLockTime() default 5000L;
}
