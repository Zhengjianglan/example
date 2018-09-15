package com.zh.spider.sys.repository;

import com.zh.spider.sys.model.Urls;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IUrlsRepository {

    Urls Query(int id);
}
