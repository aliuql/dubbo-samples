package org.apache.dubbo.common.core;

import java.io.Serializable;

/**
 * 返回结果对象
 */
public class CupsContext<T> implements Serializable {

    private String instNo;
    private String subInstNo;
    private String channelNo;

    private T data;

    public CupsContext() {
    }

    public String getInstNo() {
        return instNo;
    }

    public void setInstNo(String instNo) {
        this.instNo = instNo;
    }

    public String getSubInstNo() {
        return subInstNo;
    }

    public void setSubInstNo(String subInstNo) {
        this.subInstNo = subInstNo;
    }

    public String getChannelNo() {
        return channelNo;
    }

    public void setChannelNo(String channelNo) {
        this.channelNo = channelNo;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "CupsContext{" + "instNo='" + instNo + '\'' + ", subInstNo='" + subInstNo + '\'' + ", channelNo='"
                + channelNo + '\'' + ", data=" + data + '}';
    }
}
