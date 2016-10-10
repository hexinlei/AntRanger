package com.ant.ranger.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * @packgeName: com.ant.ranger.util
 * @ClassName: ReadFileUtil
 * @copyright: Copyright 2016-2027 Markor Investment Group Co. LTD. All Rights Reserved.
 * @description:<描述>
 * @author: hexinlei
 * @date: 16/10/2-下午6:35
 * @version: 1.0
 * @since: JDK 1.8
 */
public class ReadFileUtil {

    /**
     * 读取Properties文件
     * @param filePath
     * @return
     * @throws IOException
     */
    public static Properties readPropertyFile(final String filePath) throws IOException {
        Properties props = new Properties();
        props.load(new FileInputStream(filePath));
        return props;
    }
}
