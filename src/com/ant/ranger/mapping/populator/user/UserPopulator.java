package com.ant.ranger.mapping.populator.user;

import com.ant.ranger.data.UserData;
import com.ant.ranger.entity.User;
import com.ant.ranger.mapping.populator.AbstractPopulator;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Component;

/**
 * @packgeName: com.ant.ranger.mapping.populator.user
 * @ClassName: UserPopulatot
 * @copyright: Copyright 2016-2027 Markor Investment Group Co. LTD. All Rights Reserved.
 * @description:<描述>
 * @author: hexinlei
 * @date: 16/8/12-下午1:26
 * @version: 1.0
 * @since: JDK 1.8
 */

public class UserPopulator<SOURCE extends User,TARGET extends UserData> implements AbstractPopulator<SOURCE,TARGET>{


    protected void addCommon(User source,UserData target){

        if (StringUtils.isNotEmpty(source.getUid())){
            target.setUid(source.getUid());
        }

        if (StringUtils.isNotEmpty(source.getName())){
            target.setName(source.getName());
        }

        target.setNickName(source.getNickname());
        target.setSelfIntroduction(source.getSelfIntroduction());
        target.setImg(source.getImg());

    }

    @Override
    public void populator(SOURCE source, TARGET target) {
        addCommon(source,target);
    }
}
