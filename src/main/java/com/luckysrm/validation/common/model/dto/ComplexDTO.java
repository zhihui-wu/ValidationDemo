package com.luckysrm.validation.common.model.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * @Description: 复杂对象
 * @Author: 吴智慧
 * @Date: 2020/8/6 19:31
 */
@Getter
@Setter
@ToString
public class ComplexDTO {

    @NotNull(message = "complexValue 不能为空")
    private Integer complexValue;

    @Valid
    @NotNull
    private SimpleDTO simpleDto;
}
