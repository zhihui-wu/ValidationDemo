package com.luckysrm.validation.service.impl;

import com.luckysrm.validation.common.annotation.UServiceMethod;
import com.luckysrm.validation.common.model.dto.ComplexDTO;
import com.luckysrm.validation.common.model.dto.ComplexListDTO;
import com.luckysrm.validation.common.model.dto.SimpleDTO;
import com.luckysrm.validation.service.UserService4;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description: 用户 Service 实现
 * @Author: 吴智慧
 * @Date: 2020/8/6 15:39
 */
@Service
public class UserService4Impl implements UserService4 {

    @Override
    @UServiceMethod
    public void registerComplexModel(ComplexDTO param) {
        System.out.println(param);
        System.out.println("UserService");
    }

    @Override
    @UServiceMethod
    public void registerParameterList(ComplexListDTO param) {
        System.out.println(param);
        System.out.println("UserService");
    }

    @Override
    @UServiceMethod
    public void collectionFalse(List<SimpleDTO> param) {
        System.out.println(param);
        System.out.println("UserService");
    }
}
