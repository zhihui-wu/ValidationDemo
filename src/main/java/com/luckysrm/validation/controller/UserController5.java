package com.luckysrm.validation.controller;

import com.luckysrm.validation.common.model.ao.RegisterAO;
import com.luckysrm.validation.common.model.dto.RegisterDTO;
import com.luckysrm.validation.service.UserService;
import com.luckysrm.validation.service.UserService1;
import com.luckysrm.validation.service.UserService2;
import com.luckysrm.validation.service.UserService3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: Service校验，Validation不局限于controller，但需要注意
 * @Author: 吴智慧
 * @Date: 2020/7/28 09:09
 */
@RestController("/user5")
public class UserController5 {

    @Autowired()
    private UserService userService;
    @Autowired
    private UserService1 userService1;
    @Autowired
    private UserService2 userService2;
    @Autowired
    private UserService3 userService3;

    /**
     * 重写方法不能重写约束（正面例子）
     */
    @RequestMapping("/serviceBaseTrue1")
    public String registerServiceImplBaseTrue(RegisterAO param) {
        System.out.println();
        userService.registerBaseTrue(null);
        return "success";
    }

    /**
     * ‘@Valid’，参数为null，直接通过，不校验
     */
    @RequestMapping("/serviceBaseTrue3")
    public String registerServiceImplBaseTrue3(RegisterAO param) {
        System.out.println();
        userService.registerMultyTrue(null);
        return "success";
    }

    /**
     * ‘@Valid’，参数不为null，校验内层
     */
    @RequestMapping("/serviceBaseTrue4")
    public String registerServiceImplBaseTrue4(RegisterDTO param) {
        System.out.println();
        userService.registerMultyTrue(param);
        return "success";
    }

    /**
     * 重写方法不能重写约束（反面例子）
     */
    @RequestMapping("/serviceBaseFalse")
    public String registerServiceImplBaseFalse(RegisterAO param) {
        System.out.println();
        userService1.registerBaseFalse(null);
        return "success";
    }

    /**
     * 重写方法不能重写约束（正面例子）
     */
    @RequestMapping("/serviceBaseTrue2")
    public String registerServiceImplBaseTrue2(RegisterAO param) {
        System.out.println();
        userService2.registerBaseTrue(null);
        return "success";
    }

    /**
     * 不能使用‘@Validated’注解于方法参数（反面例子）
     */
    @RequestMapping("/serviceParamterFalse1")
    public String registerServiceImplParamterFalse1(RegisterAO param) {
        System.out.println();
        userService3.registerParamterFalse1(param);
        return "success";
    }

    /**
     * 不能使用‘@Valid’注解于方法参数（反面例子）
     */
    @RequestMapping("/serviceParamterFalse2")
    public String registerServiceImplParamterFalse2(RegisterAO param) {
        System.out.println();
        userService3.registerParamterFalse2(param);
        return "success";
    }
}
