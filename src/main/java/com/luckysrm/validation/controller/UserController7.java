package com.luckysrm.validation.controller;

import com.luckysrm.validation.common.annotation.ExistEnum;
import com.luckysrm.validation.common.enums.SexEnum;
import com.luckysrm.validation.common.model.ao.RegisterAO;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: 自定义注解-校验枚举
 * @Author: 吴智慧
 * @Date: 2020/7/28 09:09
 */
@RestController("/user7")
@Validated
public class UserController7 {

    /**
     * 自定义注解-校验枚举1
     */
    @RequestMapping("/customExistEnum1")
    public String customExistEnum1(@ExistEnum(type=SexEnum.class) Integer param) {
        System.out.println(param);
        return "success";
    }

    /**
     * 自定义注解-校验枚举2
     */
    @RequestMapping("/customExistEnum2")
    public String customExistEnum2(@Validated RegisterAO param) {
        System.out.println(param);
        return "success";
    }

    /**
     * 自定义注解-校验枚举3
     */
    @RequestMapping("/customExistEnumFieldFalse")
    public String customExistEnumFieldFalse(@ExistEnum(type=SexEnum.class, key = "value") Integer param) {
        System.out.println(param);
        return "success";
    }

    /**
     * 自定义注解-校验枚举4
     */
    @RequestMapping("/customExistEnumField")
    public String customExistEnumField(@ExistEnum(type=SexEnum.class, key = "value") String param) {
        System.out.println(param);
        return "success";
    }
}
