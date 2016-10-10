package com.ant.ranger.dao.user.impl;

import com.ant.ranger.dao.base.impl.BaseDaoImpl;
import com.ant.ranger.dao.user.UserDao;
import com.ant.ranger.dao.user.VisitorDao;
import com.ant.ranger.entity.User;
import com.ant.ranger.entity.Visitor;
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
public class VisitorDaoImpl extends BaseDaoImpl<Visitor> implements VisitorDao{

    public VisitorDaoImpl() {
        super(Visitor.class);
    }
}
