package com.luckysrm.validation.service.impl;

import com.luckysrm.validation.common.model.dto.RegisterDTO;
import com.luckysrm.validation.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;

/**
 * @Description: 用户 Service 实现
 * @Author: 吴智慧
 * @Date: 2020/8/6 15:39
 */
@Service
@Validated
public class UserServiceImpl implements UserService {

    @Override
    public void registerBaseTrue(RegisterDTO param) {
        System.out.println("UserService.registerBaseTrue");
    }

    @Override
    public void registerMultyTrue(@Valid RegisterDTO param) {
        System.out.println("UserService.registerMultyTrue");
    }
}
