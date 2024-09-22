package org.apache.dubbo.common.core;

public enum ErrorStatus implements IErrorStatus {

    SUCC("000000", "成功"),
    FAIL("000001", "失败"),
    TIMEOUT("000002", "超时"),

    /**
     * 参数错误 000100 - 000199
     */
    PARAM_IS_INVALID("001001", "参数无效"),
    PARAM_IS_BLANK("001002", "参数为空"),
    PARAM_TYPE_ERROR("001003", "参数类型错误"),
    PARAM_IS_MISSED("001004", "参数丢失"),
    PARAM_OF_PAGE_IS_BLANK("001005", "分页参数为空"),
    PARAM_FORMAT_MISTAKE("001006", "参数格式有误"),
    PARAM_TIME_ERROR("001007", "开始时间不能大于或等于截止时间"),
    PARAM_TIME_NOT_IN_RANGE("001008", "当前时间不在所选时段提交时间范围内");

    final private String code;

    final private String msg;

    ErrorStatus(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    @Override
    public String getCode() {
        return this.code;
    }

    @Override
    public String getMsg() {
        return this.msg;
    }
}
