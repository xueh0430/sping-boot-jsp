package com.xsh.config;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

/**
 * @author Zerox
 * @date 2018/12/5 13:49
 */
@Configuration
@Aspect
public class AOPConfig {

    @Around("@within(org.springframework.stereotype.Controller)")
    public Object simpleAop(final ProceedingJoinPoint pjp) throws Throwable {

        try {
            Object[] args = pjp.getArgs();
            System.out.println("args：" + Arrays.asList(args));
            //调用原有的方法
            Object o = pjp.proceed();
            System.out.println("return :" + o);
            return o;
        } catch (Throwable throwable) {
            throw throwable;
        }
    }
}
