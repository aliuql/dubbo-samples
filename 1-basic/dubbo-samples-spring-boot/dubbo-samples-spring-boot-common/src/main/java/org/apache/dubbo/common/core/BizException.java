package org.apache.dubbo.common.core;

public class BizException extends RuntimeException
{
    private String code;

    public String getCode() {
        return code;
    }

    public BizException(String code, String message) {
        super(message);
        this.code = code;
    }

    public BizException(ErrorStatus status) {
       this(status.getCode(), status.getMsg());
    }

    public BizException(ErrorStatus status, Object extMsg) {
        this(status.getCode(), status.getMsg() + (extMsg == null ? "" : ": " + extMsg));
    }
}
