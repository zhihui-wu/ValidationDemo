package com.luckysrm.validation.common.exception;

/**
 * 分页使用的：客户端的HTTP调用的应答结果类.
 * @title ResultInfo
 * @description 应答结果类，返回信息包括调用状态、可读的msg、结果数据.
 * @author hanzhiwei
 * @date 2016年10月20日
 * @version 1.0
 */
public class ResultInfo {

    /**
     * 应答结果状态码——成功
     */
    public static final int RESULT_CODE_SUCCESS = 0;
    /**
     * 应答结果状态码——通用错误
     */
    public static final int RESULT_CODE_COMMONERR = 9999;

    /**
     * 返回状态，默认0成功
     */
    private int status = RESULT_CODE_SUCCESS;

    /**
     * 返回状态描述
     */
    private String statusInfo = "SUCCESS"; // 操作结果描述信息

    /**
     * 返回数据
     */
    private Object data;// 操作返回数据绑定

    /**
     * 成功结果
     */
    public final static ResultInfo SUCCESSRESULT = new ResultInfo();

    /**
     * 返回一个默认的错误结果
     * @return 错误结果
     */
    public static ResultInfo error() {
        ResultInfo res = new ResultInfo(RESULT_CODE_COMMONERR, "ERROR");
        return res;
    }

    /**
     * 返回一个带错误信息的错误结果
     * @param errorMessage 错误信息
     * @return 错误结果
     */
    public static ResultInfo errorMessage(String errorMessage) {
        ResultInfo res = new ResultInfo(RESULT_CODE_COMMONERR, errorMessage);
        return res;
    }

    /**
     * 返回一个带错误信息和数据的错误结果
     * @param errorMessage 错误信息
     * @param data 数据
     * @return 错误结果
     */
    public static ResultInfo errorMessage(String errorMessage, Object data) {
        ResultInfo res = new ResultInfo(RESULT_CODE_COMMONERR, errorMessage);
        res.setData(data);
        return res;
    }

    /**
     * 返回一个带状态和信息的结果
     * @param status 状态
     * @param info 信息
     * @return 返回结果
     */
    public static ResultInfo result(int status, String info) {
        ResultInfo res = new ResultInfo();
        res.status = status;
        res.statusInfo = info;
        return res;
    }

    /**
     * 返回一个带状态,信息和数据的结果
     * @param status 状态
     * @param info 信息
     * @param data 数据
     * @return 返回结果
     */
    public static ResultInfo result(int status, String info, Object data) {
        ResultInfo res = new ResultInfo();
        res.status = status;
        res.statusInfo = info;
        res.data = data;
        return res;
    }

    /**
     * 返回一个成功结果
     * @return 成功结果
     */
    public static ResultInfo success() {
        ResultInfo res = new ResultInfo();
        return res;
    }

    /**
     * 返回一个带数据的成功结果
     * @param data 数据
     * @return 成功结果
     */
    public static ResultInfo success(Object data) {
        ResultInfo res = new ResultInfo();
        res.setData(data);
        return res;
    }

    /**
     * 返回一个带信息的成功结果
     * @param message 提示信息
     * @return 成功结果
     */
    public static ResultInfo successMessage(String message) {
        ResultInfo res = new ResultInfo(RESULT_CODE_SUCCESS, message);
        return res;
    }

    /**
     * 默认构造函数
     */
    public ResultInfo() {
    }

    /**
     * 带状态和信息的构造函数
     * @param status 状态
     * @param statusInfo 提示信息
     */
    public ResultInfo(int status, String statusInfo) {
        this.status = status;
        this.statusInfo = statusInfo;
    }

    /**
     * 带状态,信息和数据的构造函数
     * @param status 状态
     * @param statusInfo 提示信息
     * @param data 数据
     */
    public ResultInfo(int status, String statusInfo, Object data) {
        super();
        this.status = status;
        this.statusInfo = statusInfo;
        this.data = data;
    }

    public boolean isSuccess() {
        return this.status == 0;
    }

    public Object getData() {
        return data;
    }

    public int getStatus() {
        return status;
    }

    public String getStatusInfo() {
        return statusInfo;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setStatusInfo(String statusInfo) {
        this.statusInfo = statusInfo;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((data == null) ? 0 : data.hashCode());
        result = prime * result + status;
        result = prime * result + ((statusInfo == null) ? 0 : statusInfo.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        ResultInfo other = (ResultInfo) obj;
        if (data == null) {
            if (other.data != null) {
                return false;
            }
        } else if (!data.equals(other.data)) {
            return false;
        }
        if (status != other.status) {
            return false;
        }
        if (statusInfo == null) {
            if (other.statusInfo != null) {
                return false;
            }
        } else if (!statusInfo.equals(other.statusInfo)) {
            return false;
        }
        return true;
    }
}

