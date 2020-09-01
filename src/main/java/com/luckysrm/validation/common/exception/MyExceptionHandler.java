package com.luckysrm.validation.common.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.ConstraintViolationException;

/**
 * @Description: 统一异常处理
 * @Author: 吴智慧
 * @Date: 2020/8/31 19:19
 */
@ControllerAdvice("com.luckysrm.validation.controller")
public class MyExceptionHandler {

    private static final Logger LOGGER = LoggerFactory.getLogger(MyExceptionHandler.class);

    /**
     * 处理所有接口数据验证异常
     * @param ex 异常
     * @return 结果
     */
    @ExceptionHandler(BindException.class)
    @ResponseBody
    public ResultInfo handlerMethodArgumentNotValidException(BindException ex) {
        ex.printStackTrace();
        return ResultInfo.errorMessage(ex.getBindingResult().getAllErrors().get(0).getDefaultMessage());
    }

    /**
     * 处理所有接口数据验证异常
     * @param ex 异常
     * @return 结果
     */
    @ExceptionHandler(ConstraintViolationException.class)
    @ResponseBody
    public ResultInfo handlerConstraintViolationException(ConstraintViolationException ex) {
        ex.printStackTrace();
        return ResultInfo.errorMessage(ex.getMessage());
    }

    /**
     * 处理所有接口数据验证异常
     * @param ex 异常
     * @return 结果
     */
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ResultInfo handlerException(Exception ex) {
        System.out.println("handlerException:");
        ex.printStackTrace();
        return ResultInfo.errorMessage("异常");
    }
}
