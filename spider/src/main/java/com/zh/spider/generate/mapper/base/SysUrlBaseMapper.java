package com.zh.spider.generate.mapper.base;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import com.zh.spider.generate.model.SysUrl;
/**
*  @author zhengjianglan
*/
@Mapper
public interface SysUrlBaseMapper {

    int insertSysUrl(SysUrl object);

    int updateSysUrl(SysUrl object);

    int update(SysUrl.UpdateBuilder object);

    List<SysUrl> querySysUrl(SysUrl object);

    SysUrl querySysUrlLimit1(SysUrl object);

}