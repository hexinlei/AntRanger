package com.ant.ranger.util;

import org.hibernate.dialect.MySQL5InnoDBDialect;

/**
 * @packgeName: com.ant.ranger.util
 * @ClassName: CustomMysqlDialect
 * @copyright: Copyright 2016-2027 Markor Investment Group Co. LTD. All Rights Reserved.
 * @description:<描述>
 * @author: hexinlei
 * @date: 16/8/30-下午8:11
 * @version: 1.0
 * @since: JDK 1.8
 */
public class CustomMysqlDialect extends MySQL5InnoDBDialect {
    public String getTableTypeString() {
        return " ENGINE=InnoDB DEFAULT CHARSET=utf8";
    }
}
