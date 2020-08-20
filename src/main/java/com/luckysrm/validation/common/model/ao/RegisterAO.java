package com.luckysrm.validation.common.model.ao;


import com.luckysrm.validation.common.annotation.ExistEnum;
import com.luckysrm.validation.common.enums.SexEnum;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

/**
 * @Description: 用户注册AO
 * @Author: 吴智慧
 * @Date: 2020/7/28 09:09
 */
@Getter
@Setter
@ToString
public class RegisterAO {

    @NotBlank
    private String name;

    @Min(18)
    private Integer age;

    @Pattern(regexp = "\\d*", message = "电话号码错误")
    @NotBlank
    private String phone;

    @Email(message = "邮箱错误")
    @NotBlank
    private String email;

    @ExistEnum(type = SexEnum.class)
    private int sex;

}
