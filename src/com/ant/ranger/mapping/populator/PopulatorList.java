package com.ant.ranger.mapping.populator;

import java.util.List;

/**
 * @packgeName: com.ant.ranger.mapping.populator
 * @ClassName: PopulatorList
 * @copyright: Copyright 2016-2027 Markor Investment Group Co. LTD. All Rights Reserved.
 * @description:<描述>
 * @author: hexinlei
 * @date: 16/8/3-下午12:31
 * @version: 1.0
 * @since: JDK 1.8
 */
public interface PopulatorList<SOURCE,TARGET> {
    List<AbstractPopulator<SOURCE, TARGET>> getPopulators();

    /**
     * Set the list of populators.
     *
     * @param populators
     *           the populators
     */
    void setPopulators(List<AbstractPopulator<SOURCE, TARGET>> populators);
}
