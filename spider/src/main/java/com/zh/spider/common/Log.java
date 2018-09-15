package com.zh.spider.common;

import lombok.Singular;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Log {

    public static void Error(Exception e) {
        log.error(FormatException(e));
    }

    private static String FormatException(Exception e) {
        return String.format("出现未处理异常，类型：%s\r\n 消息：%s\r\n 堆栈：%s\r\n "
                , e.getClass(), e.getMessage(), e.getStackTrace());
    }
}
