package com.ant.ranger.dao.user;

import com.ant.ranger.dao.base.BaseDao;
import com.ant.ranger.entity.User;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @packgeName: com.ant.ranger.dao.user
 * @ClassName: UserDao
 * @copyright: Copyright 2016-2027 Markor Investment Group Co. LTD. All Rights Reserved.
 * @description:<描述>
 * @author: hexinlei
 * @date: 16/7/29-下午12:15
 * @version: 1.0
 * @since: JDK 1.8
 */
public interface UserDao extends BaseDao<User>{

    List<User> findUserByName(String name);

    User findUserByUid(String uid);

    User findUserByEmail(String email);
}
