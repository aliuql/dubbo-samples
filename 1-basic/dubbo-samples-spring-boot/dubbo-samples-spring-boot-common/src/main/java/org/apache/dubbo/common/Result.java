package org.apache.dubbo.common;

import java.io.Serializable;

/**
 * 返回结果对象
 */
public class Result<T> implements Serializable {

    protected String code;
    protected String msg;
    protected T data;

    public Result() {
        this(ErrorStatus.SUCC);
    }

    public Result(ErrorStatus status) {
        this.code = status.getCode();
        this.msg = status.getMsg();
    }

    public Result(T data) {
        this(ErrorStatus.SUCC);
        this.data = data;
    }

    public void isSuccess() {
        if (!ErrorStatus.SUCC.getCode().equals(this.getCode())) {
            throw new BizException(this.getCode(), this.getMsg());
        }
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "Result{" + "code='" + code + '\'' + ", msg='" + msg + '\'' + ", data=" + data + '}';
    }
}
