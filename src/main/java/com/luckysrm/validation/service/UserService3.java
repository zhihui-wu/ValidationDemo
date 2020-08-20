package com.luckysrm.validation.service;

import com.luckysrm.validation.common.model.ao.RegisterAO;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;

/**
 * @Description: 用户 Service
 * @Author: 吴智慧
 * @Date: 2020/8/6 15:38
 */
public interface UserService3 {

    /**
     * 简单校验
     * @param param 入参
     */
    void registerParamterFalse1(@Valid RegisterAO param);

    /**
     * 简单校验
     * @param param 入参
     */
    void registerParamterFalse2(@Validated RegisterAO param);
}
