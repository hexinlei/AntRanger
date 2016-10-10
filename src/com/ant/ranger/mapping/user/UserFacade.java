package com.ant.ranger.mapping.user;

import com.ant.ranger.data.UserData;
import org.springframework.stereotype.Component;

/**
 * @packgeName: com.ant.ranger.mapping.user
 * @ClassName: UserFacade
 * @copyright: Copyright 2016-2027 Markor Investment Group Co. LTD. All Rights Reserved.
 * @description:<描述>
 * @author: hexinlei
 * @date: 16/8/12-下午1:53
 * @version: 1.0
 * @since: JDK 1.8
 */
public interface UserFacade {

    UserData findUserByUid(String uid);
}
