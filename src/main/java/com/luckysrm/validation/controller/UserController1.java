package com.luckysrm.validation.controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @Description: ‘@Validated’ 注解于类上
 * @Author: 吴智慧
 * @Date: 2020/7/28 09:09
 */
@RestController("/user1")
@Validated
public class UserController1 {

    /**
     * 简单校验
     */
    @RequestMapping("/parameterBase")
    public String registerParameter(@NotNull Integer param) {
        System.out.println(param);
        return "success";
    }

    /**
     * 多项校验
     */
    @RequestMapping("/parameterMulty")
    public String registerMulty(@NotNull @Min(18) Integer param) {
        System.out.println(param);
        return "success";
    }

    /**
     * 校验返回值1
     */
    @RequestMapping("/varifyReturn1")
    @NotNull
    public String varifyReturn1(String param) {
        System.out.println(param);
        return param;
    }

    /**
     * 校验返回值2
     */
    @RequestMapping("/varifyReturn2")
    public @NotNull @Size(min = 5) String varifyReturn2(String param) {
        System.out.println(param);
        return param;
    }

}
