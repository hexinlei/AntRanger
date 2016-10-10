package com.ant.ranger.mapping.populator.user;

import com.ant.ranger.data.UserData;
import com.ant.ranger.data.VisitorData;
import com.ant.ranger.entity.User;
import com.ant.ranger.entity.Visitor;
import org.springframework.stereotype.Component;

/**
 * @packgeName: com.ant.ranger.mapping.populator.user
 * @ClassName: VisitorPopulator
 * @copyright: Copyright 2016-2027 Markor Investment Group Co. LTD. All Rights Reserved.
 * @description:<描述>
 * @author: hexinlei
 * @date: 16/8/12-下午5:48
 * @version: 1.0
 * @since: JDK 1.8
 */
public class VisitorPopulator extends UserPopulator<Visitor,VisitorData>{

    @Override
    public void populator(Visitor visitor, VisitorData visitorData) {
        super.populator(visitor, visitorData);
    }
}
