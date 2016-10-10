package com.ant.ranger.mapping.populator.user;

import com.ant.ranger.data.UserData;
import com.ant.ranger.data.VisitorData;
import com.ant.ranger.entity.User;
import com.ant.ranger.entity.Visitor;
import org.springframework.stereotype.Component;

/**
 * @packgeName: com.ant.ranger.mapping.populator.user
 * @ClassName: VisitorReversePopulator
 * @copyright: Copyright 2016-2027 Markor Investment Group Co. LTD. All Rights Reserved.
 * @description:<描述>
 * @author: hexinlei
 * @date: 16/8/18-下午5:28
 * @version: 1.0
 * @since: JDK 1.8
 */
public class VisitorReversePopulator<SOURCE extends UserData,TARGET extends User> extends UserReversePopulator<SOURCE,TARGET>{

    @Override
    public void populator(SOURCE source, TARGET target) {
        super.populator(source, target);
    }
}
