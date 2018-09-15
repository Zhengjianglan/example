package com.zh.spider.common;

import lombok.Getter;

public class ZhException extends Exception {

    @Getter
    private ErrorType errorType;
    @Getter
    private String errorMessage;

    private ZhException(ErrorType errorType, String msg) {
        this.errorType = errorType;
        this.errorMessage = msg;
    }

    public static ZhException Create(String msg) {
        return new ZhException(ErrorType.UnException, msg);
    }

    public static ZhException Create(ErrorType errorType, String msg) {
        return new ZhException(errorType, msg);
    }
}
