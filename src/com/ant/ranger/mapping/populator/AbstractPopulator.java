package com.ant.ranger.mapping.populator;

/**
 * @packgeName: com.ant.ranger.mapping.populator
 * @ClassName: BasePopulator
 * @copyright: Copyright 2016-2027 Markor Investment Group Co. LTD. All Rights Reserved.
 * @description:<描述>
 * @author: hexinlei
 * @date: 16/7/29-下午6:14
 * @version: 1.0
 * @since: JDK 1.8
 */
public interface AbstractPopulator<SOURCE,TARGET> {
    void populator(SOURCE source,TARGET target);
}
