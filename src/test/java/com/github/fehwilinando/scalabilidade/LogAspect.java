package com.github.fehwilinando.scalabilidade;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Configuration;


@Aspect
@Configuration
public class LogAspect {

    @Around("@annotation(com.github.fehwilinando.scalabilidade.Log)")
    public Object cut(ProceedingJoinPoint point) throws Throwable {

        Object result = null;

        try {

            System.out.println("Before execution");
            result = point.proceed();
            System.out.println("Result is " + result);
            System.out.println("After execution");

        } catch (Throwable e) {
            System.err.println("Error " + e);
            throw e;
        }

        return result;
    }
}
