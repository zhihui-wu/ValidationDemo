package com.luckysrm.validation.common.model.ao;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.validator.constraints.UniqueElements;

import javax.validation.constraints.NotBlank;

/**
 * @Description: 用户登录AO
 * @Author: 吴智慧
 * @Date: 2020/7/28 09:09
 */
@Getter
@Setter
@ToString
public class LoginAO {

    @NotBlank
    private String name;

    @NotBlank(groups = Member.class)
    private String password;

    public interface Member{}

    public interface Customer{}

}
