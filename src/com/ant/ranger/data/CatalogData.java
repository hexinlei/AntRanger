package com.ant.ranger.data;

import java.util.List;
import java.util.Set;

/**
 * @packgeName: com.ant.ranger.mapping.catalog
 * @ClassName: CatalogData
 * @copyright: Copyright 2016-2027 Markor Investment Group Co. LTD. All Rights Reserved.
 * @description:<描述>
 * @author: hexinlei
 * @date: 16/9/10-上午10:57
 * @version: 1.0
 * @since: JDK 1.8
 */

public class CatalogData {
    String cid;
    String code;
    String description;
    String name;
    Integer level;
    List<CatalogData> dataSet;


    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public List<CatalogData> getDataSet() {
        return dataSet;
    }

    public void setDataSet(List<CatalogData> dataSet) {
        this.dataSet = dataSet;
    }
}
