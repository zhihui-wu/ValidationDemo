package com.luckysrm.validation.service.impl;

import com.luckysrm.validation.common.model.dto.RegisterDTO;
import com.luckysrm.validation.service.UserService1;
import com.luckysrm.validation.service.UserService2;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;

/**
 * @Description: 用户 Service 实现
 * @Author: 吴智慧
 * @Date: 2020/8/6 15:39
 */
@Service
public class UserService2Impl implements UserService2 {

    @Override
    public void registerBaseTrue(RegisterDTO param) {
        System.out.println("UserService.registerBaseFalse");
    }
}
