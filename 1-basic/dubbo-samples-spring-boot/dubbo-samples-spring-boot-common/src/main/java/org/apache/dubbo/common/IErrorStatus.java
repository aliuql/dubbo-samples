package org.apache.dubbo.common;

public interface IErrorStatus {
    /**
     * 获取响应码
     *
     * @return 响应码
     */
    String getCode();

    /**
     * 获取响应消息
     *
     * @return 响应消息
     */
    String getMsg();
}
