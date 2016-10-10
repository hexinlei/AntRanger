package com.ant.ranger.mapping.user.impl;

import com.ant.ranger.data.UserData;
import com.ant.ranger.entity.User;
import com.ant.ranger.entity.Visitor;
import com.ant.ranger.mapping.conventer.user.UserConventer;
import com.ant.ranger.mapping.conventer.user.VisitorConventer;
import com.ant.ranger.mapping.populator.user.UserPopulator;
import com.ant.ranger.mapping.user.UserFacade;
import com.ant.ranger.service.user.UserService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @packgeName: com.ant.ranger.mapping.user.impl
 * @ClassName: UserFacadeImpl
 * @copyright: Copyright 2016-2027 Markor Investment Group Co. LTD. All Rights Reserved.
 * @description:<描述>
 * @author: hexinlei
 * @date: 16/8/12-下午1:54
 * @version: 1.0
 * @since: JDK 1.8
 */
@Component
public class UserFacadeImpl implements UserFacade{

    @Resource
    private VisitorConventer visitorConventer;

    @Resource
    private UserConventer userConventer;

    @Resource
    private UserService userService;

    @Override
    public UserData findUserByUid(String uid) {
        User user = userService.findUserByUid(uid);
        if (null!=user){
            UserData userData = null;
            if (user instanceof User){
                userData = (UserData) userConventer.convert(user);
            }

            if (user instanceof Visitor){
                userData = visitorConventer.convert((Visitor) user);
            }
            return userData;
        }

        return null;
    }
}
