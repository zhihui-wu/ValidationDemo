package com.luckysrm.validation.service;

import com.luckysrm.validation.common.model.dto.RegisterDTO;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;

/**
 * @Description: 用户 Service
 * @Author: 吴智慧
 * @Date: 2020/8/6 15:38
 */
@Validated
public interface UserService2 {

    /**
     * 简单校验
     * @param param 入参
     */
    void registerBaseTrue(@NotNull RegisterDTO param);
}
