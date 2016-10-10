package com.ant.ranger.service.user;

import com.ant.ranger.dao.base.BaseDao;
import com.ant.ranger.entity.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @packgeName: com.ant.ranger.service.user
 * @ClassName: UserService
 * @copyright: Copyright 2016-2027 Markor Investment Group Co. LTD. All Rights Reserved.
 * @description:<描述>
 * @author: hexinlei
 * @date: 16/7/29-下午5:56
 * @version: 1.0
 * @since: JDK 1.8
 */

public interface UserService {
    User findUserByUid(String uid);
    void saveUser(User user);
    User findUserByEmail(String email);
}
