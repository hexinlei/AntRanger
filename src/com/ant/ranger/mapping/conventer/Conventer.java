package com.ant.ranger.mapping.conventer;

import org.springframework.core.convert.ConversionException;

/**
 * @packgeName: com.ant.ranger.mapping.conventer
 * @ClassName: Conventer
 * @copyright: Copyright 2016-2027 Markor Investment Group Co. LTD. All Rights Reserved.
 * @description:<描述>
 * @author: hexinlei
 * @date: 16/7/29-下午6:17
 * @version: 1.0
 * @since: JDK 1.8
 */
public interface Conventer<SOURCE,TARGET> extends org.springframework.core.convert.converter.Converter<SOURCE,TARGET>{
    TARGET convert(SOURCE var1) throws ConversionException;

    TARGET convert(SOURCE var1, TARGET var2) throws ConversionException;
}
