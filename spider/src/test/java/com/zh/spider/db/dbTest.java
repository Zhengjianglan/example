package com.zh.spider.db;

import com.zh.spider.generate.mapper.SysUrlMapper;
import com.zh.spider.generate.model.SysUrl;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.time.LocalDateTime;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class dbTest {
    @Autowired
    DataSource dataSource;

    @Resource
    SysUrlMapper urlMapper;

    @Test
    @Transactional
    public void test() throws Exception {
        TestInsert();
    }

    public void QueryTest(){
        SysUrl query = new SysUrl();
        query.setLevel(0);
        SysUrl u = urlMapper.querySysUrlLimit1(query);
        System.out.print(u);
    }

    @Transactional()
    public void TestQueryList(){
        SysUrl query = new SysUrl();
        query.setLevel(0);
        List<SysUrl> u = urlMapper.querySysUrl(query);
        System.out.print(u);
    }

    public void TestDelete(){
        System.out.print(urlMapper.DeleteById(1));
    }

    @Transactional()
    public void TestInsert() throws Exception {
        SysUrl insert = new SysUrl();
        insert.setLevel(0);
        insert.setRemark("test2");
        insert.setUrl("https://www.baidu.com/");
        insert.setCreate(LocalDateTime.now());
        insert.setUpdate(LocalDateTime.now());
        int result = urlMapper.insertSysUrl(insert);
        System.out.print(result + insert.toString());
        throw new Exception("Test");
    }
}
