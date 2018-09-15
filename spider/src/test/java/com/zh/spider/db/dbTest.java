package com.zh.spider.db;

import com.zh.spider.generate.mapper.SysUrlMapper;
import com.zh.spider.generate.model.SysUrl;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import javax.sql.DataSource;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class dbTest {
    @Autowired
    DataSource dataSource;

    @Resource
    SysUrlMapper urlMapper;

    @Test
    public void test() {
        SysUrl u = urlMapper.querySysUrlLimit1(new SysUrl());
        System.out.print(u);
    }
}
