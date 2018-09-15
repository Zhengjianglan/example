package com.zh.spider.common;

/**
 * 异常类型
 *
 * @author zhengjianglan
 */
public enum ErrorType {

    UnException("UnException", -1);

    private String name;
    private int value;

    ErrorType(String name, int value) {
        this.name = name;
        this.value = value;
    }
}
