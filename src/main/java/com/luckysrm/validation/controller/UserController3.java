package com.luckysrm.validation.controller;

import com.luckysrm.validation.common.annotation.UServiceMethod;
import com.luckysrm.validation.common.model.ao.RegisterAO;
import com.luckysrm.validation.common.model.dto.ComplexDTO;
import com.luckysrm.validation.common.model.dto.ComplexListDTO;
import com.luckysrm.validation.common.model.dto.SimpleDTO;
import com.luckysrm.validation.service.UserService4;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: AOP切面手动校验，可集成在统一异常处理中
 *              复杂参数校验（级联与容器）
 * @Author: 吴智慧
 * @Date: 2020/7/28 09:09
 */
@RestController("/user3")
public class UserController3 {

    @Autowired
    private UserService4 userService4;

    /**
     * AOP手动校验
     */
    @RequestMapping("/manualAop")
    @UServiceMethod
    public String registerManualAop(RegisterAO param) {
        System.out.println(param);
        return "success";
    }

    /**
     * 复杂对象，级联校验
     */
    @RequestMapping("/complexModel")
    public String registerComplexModel() {
        ComplexDTO param = new ComplexDTO();
        param.setComplexValue(1);
        param.setSimpleDto(new SimpleDTO());
        userService4.registerComplexModel(param);
        return "success";
    }

    /**
     * 容器校验，如：List
     */
    @RequestMapping("/collection")
    public String collection() {
        SimpleDTO simpleDto = new SimpleDTO();
        List<SimpleDTO> simpleList = new ArrayList<>();
        simpleList.add(simpleDto);

        ComplexListDTO param = new ComplexListDTO();
        param.setComplexValue(1);
        param.setSimpleDto1(simpleList);

        userService4.registerParameterList(param);
        return "success";
    }

    /**
     * 容器校验，如：List，反例
     */
    @RequestMapping("/collectionFalse")
    public String collectionFalse() {
        SimpleDTO simpleDto = new SimpleDTO();
        List<SimpleDTO> simpleList = new ArrayList<>();
        simpleList.add(simpleDto);

        userService4.collectionFalse(simpleList);
        return "success";
    }
}
