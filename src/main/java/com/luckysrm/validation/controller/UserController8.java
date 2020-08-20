package com.luckysrm.validation.controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * @Description: 消息国际化
 * @Author: 吴智慧
 * @Date: 2020/7/28 09:09
 */
@RestController("/user8")
@Validated
public class UserController8 {

    /**
     * 简单消息
     */
    @RequestMapping("/nationalBase")
    public String nationalBase(@NotNull(message = "{validation.national}") Integer param) {
        System.out.println(param);
        return "success";
    }

    /**
     * 自定义注解-校验枚举1
     */
    @RequestMapping("/nationalBaseMutply")
    public String nationalBaseMutply(@Min(value = 18, message = "{age}{validation.min}")
            @Max(value = 60, message = "{age}{validation.max}") Integer param) {
        System.out.println(param);
        return "success";
    }
}
