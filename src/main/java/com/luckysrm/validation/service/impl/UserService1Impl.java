package com.luckysrm.validation.service.impl;

import com.luckysrm.validation.common.model.dto.RegisterDTO;
import com.luckysrm.validation.service.UserService1;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;

/**
 * @Description: 用户 Service 实现
 * @Author: 吴智慧
 * @Date: 2020/8/6 15:39
 */
@Service
@Validated
public class UserService1Impl implements UserService1 {

    @Override
    public void registerBaseFalse(@NotNull RegisterDTO param) {
        System.out.println("UserService.registerBaseFalse");
    }
}
