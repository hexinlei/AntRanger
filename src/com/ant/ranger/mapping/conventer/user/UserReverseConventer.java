package com.ant.ranger.mapping.conventer.user;

import com.ant.ranger.data.UserData;
import com.ant.ranger.data.VisitorData;
import com.ant.ranger.entity.User;
import com.ant.ranger.entity.Visitor;
import com.ant.ranger.mapping.conventer.AbstractPopulatorConverter;
import com.ant.ranger.mapping.populator.AbstractPopulator;
import com.ant.ranger.mapping.populator.user.UserReversePopulator;
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

public class UserReverseConventer<SOURCE extends UserData,TARGET extends User> extends AbstractPopulatorConverter<SOURCE,TARGET>{

    private Class<TARGET> targetClass;

    @Resource
    private UserReversePopulator userReversePopulator;

    private List<AbstractPopulator<SOURCE, TARGET>> populators;


    @Override
    public TARGET convert(SOURCE source) throws ConversionException {

        if (source instanceof VisitorData){
            targetClass = (Class<TARGET>) Visitor.class;
        }

        if (source instanceof UserData){
            targetClass = (Class<TARGET>) User.class;
        }
        populators = new ArrayList<>();

        populators.add(userReversePopulator);

        setPopulators(populators);
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
