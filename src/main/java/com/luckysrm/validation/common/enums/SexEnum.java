package com.luckysrm.validation.common.enums;

public enum SexEnum {
    /**
     * 男
     */
    MAIL(1, "男"),

    /**
     * 女
     */
    FEMAIL(2, "女");

    private int code;

    private String value;

    public int getCode() {
        return code;
    }

    public String getValue() {
        return value;
    }

    SexEnum(int code, String value){
        this.code = code;
        this.value = value;
    }
}
