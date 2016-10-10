package com.ant.ranger.mapping.populator.user;

import com.ant.ranger.data.UserData;
import com.ant.ranger.entity.User;
import com.ant.ranger.mapping.populator.AbstractPopulator;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Component;

/**
 * @packgeName: com.ant.ranger.mapping.populator.user
 * @ClassName: UserReversePopulator
 * @copyright: Copyright 2016-2027 Markor Investment Group Co. LTD. All Rights Reserved.
 * @description:<描述>
 * @author: hexinlei
 * @date: 16/8/18-下午5:24
 * @version: 1.0
 * @since: JDK 1.8
 */

public class UserReversePopulator<SOURCE extends UserData,TARGET extends User> implements AbstractPopulator<SOURCE,TARGET>{

    @Override
    public void populator(SOURCE source, TARGET target) {
        populatorCommon(source,target);
    }

    protected void populatorCommon(SOURCE source, TARGET target){
        String uid = source.getUid();

        if (StringUtils.isNotEmpty(uid)){
            target.setUid(uid);
        }

        String name = source.getName();

        if (StringUtils.isNotEmpty(name)){
            target.setName(source.getName());
        }
    }
}
