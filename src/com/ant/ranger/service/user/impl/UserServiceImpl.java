package com.ant.ranger.service.user.impl;

import com.ant.ranger.dao.user.UserDao;
import com.ant.ranger.entity.User;
import com.ant.ranger.service.user.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @packgeName: com.ant.ranger.service.user.impl
 * @ClassName: UserServiceImpl
 * @copyright: Copyright 2016-2027 Markor Investment Group Co. LTD. All Rights Reserved.
 * @description:<描述>
 * @author: hexinlei
 * @date: 16/8/12-下午1:59
 * @version: 1.0
 * @since: JDK 1.8
 */
@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
@Service
public class UserServiceImpl implements UserService{

    @Resource
    private UserDao userDao;

    @Override
    public User findUserByUid(String uid) {
        return userDao.findUserByUid(uid);
    }

    @Override
    public void saveUser(User user) {
        userDao.insert(user);
    }

    @Override
    public User findUserByEmail(String email) {
        return userDao.findUserByEmail(email);
    }
}
