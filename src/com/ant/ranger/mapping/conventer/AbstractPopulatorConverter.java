package com.ant.ranger.mapping.conventer;

import com.ant.ranger.mapping.populator.AbstractPopulator;
import com.ant.ranger.mapping.populator.PopulatorList;

import java.util.List;

/**
 * @packgeName: com.ant.ranger.mapping.conventer
 * @ClassName: AbstractPopulatorConverter
 * @copyright: Copyright 2016-2027 Markor Investment Group Co. LTD. All Rights Reserved.
 * @description:<描述>
 * @author: hexinlei
 * @date: 16/8/3-下午12:32
 * @version: 1.0
 * @since: JDK 1.8
 */
public abstract class AbstractPopulatorConverter<SOURCE, TARGET> extends AbstractConventer<SOURCE, TARGET> implements PopulatorList<SOURCE, TARGET> {
    private List<AbstractPopulator<SOURCE, TARGET>> populators;

    @Override
    public List<AbstractPopulator<SOURCE, TARGET>> getPopulators() {
        return populators;
    }

    @Override
    public void setPopulators(final List<AbstractPopulator<SOURCE, TARGET>> populators) {
        this.populators = populators;
    }

    @Override
    public void populator(SOURCE source, TARGET target) {
        final List<AbstractPopulator<SOURCE, TARGET>> list = getPopulators();
        if (list != null) {
            for (final AbstractPopulator<SOURCE, TARGET> populator : list) {
                if (populator != null) {
                    populator.populator(source, target);
                }
            }
        }
    }
}
