package com.luckysrm.validation.service.impl;

import com.luckysrm.validation.common.model.ao.RegisterAO;
import com.luckysrm.validation.common.model.dto.ComplexDTO;
import com.luckysrm.validation.common.model.dto.RegisterDTO;
import com.luckysrm.validation.service.UserService2;
import com.luckysrm.validation.service.UserService3;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;

/**
 * @Description: 用户 Service 实现
 * @Author: 吴智慧
 * @Date: 2020/8/6 15:39
 */
@Service
public class UserService3Impl implements UserService3 {

    @Override
    public void registerParamterFalse1(RegisterAO param) {
        System.out.println(param);
        System.out.println("UserService");

    }

    @Override
    public void registerParamterFalse2(RegisterAO param) {
        System.out.println(param);
        System.out.println("UserService");

    }
}
