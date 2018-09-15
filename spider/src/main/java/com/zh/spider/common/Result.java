package com.zh.spider.common;

import lombok.Data;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Data
public class Result<T> {

    private String error;
    private boolean success;
    private T data;

    public Result(String error) {
        this.success = false;
        this.error = error;
    }

    public Result(T data) {
        this.success = true;
        this.data = data;
    }

    public static <T> Result Success(T data) {
        return new Result<T>(data);
    }

    public static Result Error(String msg) {
        return new Result(msg);
    }

    public static Result Error(Exception e) {
        String msg = String.format(" UnHandlerException :\r\n Type: %s\r\n StackTrace: %s",
                e.getClass(), e.getStackTrace());
        return new Result(msg);
    }
}
