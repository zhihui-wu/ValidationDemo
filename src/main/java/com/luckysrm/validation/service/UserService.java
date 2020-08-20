package com.luckysrm.validation.service;

import com.luckysrm.validation.common.model.dto.RegisterDTO;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * @Description: 用户 Service
 * @Author: 吴智慧
 * @Date: 2020/8/6 15:38
 */
public interface UserService {

    /**
     * 简单校验
     * @param param 入参
     */
    void registerBaseTrue(@NotNull RegisterDTO param);

    /**
     * 简单校验
     * @param param 入参
     */
    void registerMultyTrue(@Valid RegisterDTO param);
}
