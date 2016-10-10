package com.ant.ranger.dao.user.impl;

import com.ant.ranger.dao.base.impl.BaseDaoImpl;
import com.ant.ranger.dao.user.UserDao;
import com.ant.ranger.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @packgeName: com.ant.ranger.dao.user.impl
 * @ClassName: UserDaoImpl
 * @copyright: Copyright 2016-2027 Markor Investment Group Co. LTD. All Rights Reserved.
 * @description:<描述>
 * @author: hexinlei
 * @date: 16/7/29-下午12:18
 * @version: 1.0
 * @since: JDK 1.8
 */
@Repository
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao{

    public UserDaoImpl() {
        super(User.class);
    }

    @Override
    public List<User> findUserByName(String name) {
        String hql = "from User u where u.name = ?";
        return queryListForParam(hql,new Object[]{name});
    }

    @Override
    public User findUserByUid(String uid) {
        String hql = "from User u where u.uid = ?";
        List<User> userList = queryListForParam(hql,new Object[]{uid});
        return userList!=null && userList.size()>0?userList.get(0):null;
    }

    @Override
    public User findUserByEmail(String email) {
        String hql = "from User u where u.email = ?";
        List<User> userList = queryListForParam(hql,new Object[]{email});
        return userList!=null && userList.size()>0?userList.get(0):null;
    }
}
