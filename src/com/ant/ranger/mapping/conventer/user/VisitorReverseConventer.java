package com.ant.ranger.mapping.conventer.user;

import com.ant.ranger.data.UserData;
import com.ant.ranger.data.VisitorData;
import com.ant.ranger.entity.User;
import com.ant.ranger.entity.Visitor;
import com.ant.ranger.mapping.conventer.AbstractConventer;
import com.ant.ranger.mapping.conventer.AbstractPopulatorConverter;
import com.ant.ranger.mapping.populator.AbstractPopulator;
import com.ant.ranger.mapping.populator.user.VisitorPopulator;
import com.ant.ranger.mapping.populator.user.VisitorReversePopulator;
import org.springframework.core.convert.ConversionException;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * @packgeName: com.ant.ranger.mapping.conventer.user
 * @ClassName: VissitorReverseConventer
 * @copyright: Copyright 2016-2027 Markor Investment Group Co. LTD. All Rights Reserved.
 * @description:<描述>
 * @author: hexinlei
 * @date: 16/8/18-下午5:06
 * @version: 1.0
 * @since: JDK 1.8
 */
public class VisitorReverseConventer extends UserReverseConventer<VisitorData,Visitor>{

    @Override
    public Visitor convert(VisitorData visitorData) throws ConversionException {
        Visitor target = createTarget();
        populator(visitorData,target);
        return target;
    }

    @Override
    protected Visitor createTarget() {
        return new Visitor();
    }
}
