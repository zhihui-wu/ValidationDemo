package com.luckysrm.validation.controller;

import com.luckysrm.validation.common.model.ao.LoginAO;
import com.luckysrm.validation.common.model.ao.RegisterAO;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: ‘@Validated’ 注解于方法签名的参数上
 * @Author: 吴智慧
 * @Date: 2020/7/28 09:09
 */
@RestController("/user")
public class UserController {

    /**
     * 基础校验-错误信息绑定
     */
    @RequestMapping("/binding")
    public String registerBinding(@Validated RegisterAO param, BindingResult result) {
        System.out.println(param);
        System.out.println(result);
        return "success";
    }

    /**
     * 基础校验-抛出异常
     */
    @RequestMapping("/exception")
    public String registerException(@Validated RegisterAO param) {
        System.out.println(param);
        return "success";
    }

    /**
     * 分组校验-默认
     */
    @RequestMapping("/groupDefault")
    public String loginGroupDefault(@Validated LoginAO param) {
        System.out.println(param);
        return "success";
    }

    /**
     * 分组校验-指定分组
     */
    @RequestMapping("/groupSpecific")
    public String loginGroupSpecific(@Validated({LoginAO.Member.class}) LoginAO param) {
        System.out.println(param);
        return "success";
    }
}
