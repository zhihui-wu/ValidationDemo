package com.luckysrm.validation.controller;

import com.luckysrm.validation.common.annotation.UServiceMethod;
import com.luckysrm.validation.common.model.ao.RegisterAO;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;

/**
 * @Description: 混合校验，都会生效，时机不同
 * @Author: 吴智慧
 * @Date: 2020/7/28 09:09
 */
@RestController("/user4")
@Validated
public class UserController4 {

    /**
     * 混合校验
     */
    @RequestMapping("/mixture")
    public String registerMixture(@NotNull Integer param, @Validated RegisterAO param1) {
        System.out.println(param);
        System.out.println(param1);
        return "success";
    }

    /**
     * 混合使用1
     */
    @RequestMapping("/mixture1")
    @UServiceMethod
    public String registerMixture1(@NotNull Integer param1, RegisterAO param) {
        System.out.println(param1);
        System.out.println(param);
        return "success";
    }

    /**
     * 混合使用2
     */
    @RequestMapping("/mixture2")
    @UServiceMethod
    public String registerMixture2(@NotNull Integer param1,
                                   RegisterAO param,
                                   @Validated RegisterAO param2) {
        System.out.println(param1);
        System.out.println(param);
        System.out.println(param2);
        return "success";
    }
}
