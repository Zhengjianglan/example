package com.zh.spider.base.controller;

import com.zh.spider.common.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

@RestControllerAdvice
@RestController
@Slf4j
public class BaseController {

    @ExceptionHandler
    @ResponseBody
    public Result HandlerException(HttpServletRequest request, Exception e) {
        log.error(e.getMessage());
        return Result.Error(e);
    }
}
