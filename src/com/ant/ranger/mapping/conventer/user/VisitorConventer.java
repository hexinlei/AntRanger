package com.ant.ranger.mapping.conventer.user;

import com.ant.ranger.data.UserData;
import com.ant.ranger.data.VisitorData;
import com.ant.ranger.entity.User;
import com.ant.ranger.entity.Visitor;
import com.ant.ranger.mapping.conventer.AbstractPopulatorConverter;
import com.ant.ranger.mapping.populator.AbstractPopulator;
import com.ant.ranger.mapping.populator.user.VisitorPopulator;
import org.springframework.core.convert.ConversionException;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * @packgeName: com.ant.ranger.mapping.conventer.user
 * @ClassName: VisitorConventer
 * @copyright: Copyright 2016-2027 Markor Investment Group Co. LTD. All Rights Reserved.
 * @description:<描述>
 * @author: hexinlei
 * @date: 16/8/12-下午5:18
 * @version: 1.0
 * @since: JDK 1.8
 */
public class VisitorConventer extends UserConventer<Visitor,VisitorData> {

    @Override
    public VisitorData convert(Visitor visitor) throws ConversionException {
        VisitorData target = createTarget();
        populator(visitor,target);
        return target;
    }

    @Override
    protected VisitorData createTarget() {
        return new VisitorData();
    }
}
