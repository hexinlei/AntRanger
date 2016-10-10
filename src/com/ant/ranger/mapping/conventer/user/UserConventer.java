package com.ant.ranger.mapping.conventer.user;

import com.ant.ranger.data.UserData;
import com.ant.ranger.data.VisitorData;
import com.ant.ranger.entity.User;
import com.ant.ranger.entity.Visitor;
import com.ant.ranger.mapping.conventer.AbstractPopulatorConverter;
import com.ant.ranger.mapping.populator.AbstractPopulator;
import com.ant.ranger.mapping.populator.user.UserPopulator;
import org.springframework.core.convert.ConversionException;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @packgeName: com.ant.ranger.mapping.conventer.user
 * @ClassName: UserConventer
 * @copyright: Copyright 2016-2027 Markor Investment Group Co. LTD. All Rights Reserved.
 * @description:<描述>
 * @author: hexinlei
 * @date: 16/8/19-下午4:36
 * @version: 1.0
 * @since: JDK 1.8
 */
public class UserConventer <SOURCE extends User,TARGET extends UserData> extends AbstractPopulatorConverter<SOURCE,TARGET> {

    private Class<TARGET> targetClass;

    private List<AbstractPopulator<SOURCE, TARGET>> populators;

    @Override
    public TARGET convert(SOURCE source) throws ConversionException {

        if (source instanceof Visitor){
            targetClass = (Class<TARGET>) VisitorData.class;
        }

        if (source instanceof User){
            targetClass = (Class<TARGET>) UserData.class;
        }
        TARGET target = createFromClass();
        populator(source,target);
        return target;
    }

    @Override
    protected TARGET createFromClass() {
        try
        {
            return targetClass.newInstance();
        }
        catch (InstantiationException | IllegalAccessException e)
        {
            throw new RuntimeException(e);
        }
    }
}
