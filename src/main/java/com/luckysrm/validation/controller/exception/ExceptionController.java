package com.luckysrm.validation.controller.exception;

import com.luckysrm.validation.common.model.ao.RegisterAO;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;

/**
 * @Description: 统一异常处理 Controller
 * @Author: 吴智慧
 * @Date: 2020/9/1 13:15
 */
@RestController("/exception")
@Validated
public class ExceptionController {

    /**
     * 基础校验-抛出异常
     */
    @RequestMapping("/exceptionHandle")
    public String registerException(@Validated RegisterAO param, @NotNull Integer count) {
        System.out.println(param);
        System.out.println(count);
        return "success";
    }
}
