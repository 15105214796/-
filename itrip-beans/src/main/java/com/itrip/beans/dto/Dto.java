package com.itrip.beans.dto;

/**
 * 数据传输对象
 */
public class Dto<T> {
    /**
     * 成功标识
     */
    private String success;
    /**
     * 错误码(没有错误是0)
     */
    private String errorCode;
    /**
     * 消息描述
     */
    private String msg;
    /**
     * 封装的数据
     */
    private T data;

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
