package com.zh.spider.base.controller;

import com.zh.spider.common.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "test")
public class TestController {

    @RequestMapping(path = "get")
    public Result Get() {
        return Result.Success("zh");
    }
}
