package com.luckysrm.validation.controller;

import com.luckysrm.validation.common.model.ao.RegisterAO;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.Set;

/**
 * @Description: 目标方法内手动校验
 * @Author: 吴智慧
 * @Date: 2020/7/28 09:09
 */
@RestController("/user2")
public class UserController2 implements ApplicationContextAware {

    /**
     * Spring应用上下文环境
     */
    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    /**
     * 手动校验（依赖容器）
     */
    @RequestMapping("/manualContainer")
    public String manualContainer(RegisterAO param) {
        // 从容器中获取
        Validator validator = applicationContext.getBean(Validator.class);
        Set<ConstraintViolation<RegisterAO>> set = validator.validate(param);
        for (ConstraintViolation<RegisterAO> constraintViolation : set) {
            System.out.println(constraintViolation.getMessage());
        }
        return "success";
    }

    /**
     * 手动校验（不依赖容器）
     */
    @RequestMapping("/manual")
    public String manual(RegisterAO param) {
        // 调用静态方法创建
        Validator validator = Validation.buildDefaultValidatorFactory().getValidator();
        Set<ConstraintViolation<RegisterAO>> set = validator.validate(param);
        for (ConstraintViolation<RegisterAO> constraintViolation : set) {
            System.out.println(constraintViolation.getMessage());
        }
        return "success";
    }
}
