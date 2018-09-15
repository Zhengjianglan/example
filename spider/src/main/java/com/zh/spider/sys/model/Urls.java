package com.zh.spider.sys.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Urls {
    private int id;
    private String url;
    private String remark;
    private int level;
}
