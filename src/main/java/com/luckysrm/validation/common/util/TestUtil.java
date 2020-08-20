package com.luckysrm.validation.common.util;

import com.luckysrm.validation.common.model.ao.LoginAO;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;

/**
 * @Description: 工具类
 * @Author: 吴智慧
 * @Date: 2020/8/7 17:18
 */
@Validated
public class TestUtil {

    public static void test1(@NotNull LoginAO param){
        System.out.println("TestUtil");
        System.out.println(param);
    }
}

