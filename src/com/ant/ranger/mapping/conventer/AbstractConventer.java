package com.ant.ranger.mapping.conventer;

import com.ant.ranger.mapping.populator.AbstractPopulator;
import org.springframework.core.convert.ConversionException;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * @packgeName: com.ant.ranger.mapping.conventer
 * @ClassName: BaseConventer
 * @copyright: Copyright 2016-2027 Markor Investment Group Co. LTD. All Rights Reserved.
 * @description:<描述>
 * @author: hexinlei
 * @date: 16/7/29-下午6:07
 * @version: 1.0
 * @since: JDK 1.8
 */
public abstract class AbstractConventer<SOURCE,TARGET> implements Conventer<SOURCE,TARGET>,AbstractPopulator<SOURCE,TARGET>{

    private Class<TARGET> targetClass;

    @Override
    public TARGET convert(SOURCE source) throws ConversionException {
        final TARGET target = targetClass == null ? createTarget() : createFromClass();
        return target;
    }

    @Override
    public TARGET convert(SOURCE source, TARGET target) throws ConversionException {
        populator(source,target);
        return target;
    }

    @Override
    public abstract void populator(SOURCE source, TARGET target);

    public void setTargetClass(final Class<TARGET> targetClass)
    {
        this.targetClass = targetClass;

        // sanity check - can we instantiate that class ?
        if (targetClass != null)
        {
            createFromClass();
        }
    }


    protected TARGET createTarget(){
        throw new NotImplementedException();
    }

    protected TARGET createFromClass()
    {
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
