package com.luckysrm.validation.service;

import com.luckysrm.validation.common.model.dto.ComplexDTO;
import com.luckysrm.validation.common.model.dto.ComplexListDTO;
import com.luckysrm.validation.common.model.dto.SimpleDTO;

import java.util.List;

/**
 * @Description: 用户 Service
 * @Author: 吴智慧
 * @Date: 2020/8/6 15:38
 */
public interface UserService4 {

    /**
     * 复杂对象，级联校验
     * @param param 入参
     */
    void registerComplexModel(ComplexDTO param);

    /**
     * 容器校验，如：List
     * @param param 入参
     */
    void registerParameterList(ComplexListDTO param);

    /**
     * 容器校验，如：List
     * @param param 入参
     */
    void collectionFalse(List<SimpleDTO> param);
}
