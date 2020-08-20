package com.luckysrm.validation.common.model.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

/**
 * @Description: 复杂对象
 * @Author: 吴智慧
 * @Date: 2020/8/6 19:31
 */
@Getter
@Setter
@ToString
public class ComplexListDTO {

    @NotNull(message = "complexValue 不能为空")
    private Integer complexValue;

    @Valid
    @NotNull
    @Size(min = 1)
    private List<SimpleDTO> simpleDto1;
}
