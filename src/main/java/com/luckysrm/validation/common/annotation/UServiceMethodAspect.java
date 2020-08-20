package com.luckysrm.validation.common.annotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import java.util.Set;

@Aspect
@Component
@Order(1)
public class UServiceMethodAspect implements ApplicationContextAware {

    /**
     * Spring应用上下文环境
     */
    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    @Pointcut("@annotation(UServiceMethod)")
    public void methodPointcut() {
    }


    @Around(value = "methodPointcut()")
    public Object methodPointcut(ProceedingJoinPoint point) throws Throwable {
        Validator validator = applicationContext.getBean(Validator.class);
        Object[] args = point.getArgs();
        if (args != null) {
            for (Object arg : args) {
                if (arg == null) {
                    continue;
                }
                Set<ConstraintViolation<Object>> violations =  validator.validate(arg);
                for (ConstraintViolation<Object> violation : violations) {
                    System.out.println(violation.getMessage());
                    throw new RuntimeException("aop validation 校验失败");
                }
            }
        }
        return point.proceed(args);
    }
}
