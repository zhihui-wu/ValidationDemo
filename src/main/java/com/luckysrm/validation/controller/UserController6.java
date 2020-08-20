package com.luckysrm.validation.controller;

import com.luckysrm.validation.common.model.ao.LoginAO;
import com.luckysrm.validation.common.util.TestUtil;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;

/**
 * @Description: 其他校验失效反例
 * @Author: 吴智慧
 * @Date: 2020/7/28 09:09
 */
@RestController("/user6")
@Validated
public class UserController6 {

    /**
     * 工具类静态方法
     */
    @RequestMapping("/utilStatic")
    public String loginUtil(LoginAO param) {
        TestUtil.test1(null);
        System.out.println(param);
        return "success";
    }

    /**
     * 私有方法调用
     */
    @RequestMapping("/internalInvock")
    public String privateInvock(LoginAO param) {
        doSomething1(null);
        doSomething2(null);
        System.out.println(param);
        return "success";
    }

    private void doSomething1(@Validated LoginAO param){
        System.out.println("doSomething1");
    }

    private void doSomething2(@NotNull LoginAO param){
        System.out.println("doSomething2");
    }
}
