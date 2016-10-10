package com.ant.ranger.dao.hibernate;

import com.ant.ranger.service.generate.ARBaseGenerateNoStrategies;
import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.id.IdentifierGenerator;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import javax.annotation.Resource;
import java.io.Serializable;

/**
 * @packgeName: com.ant.ranger.dao.hibernate
 * @ClassName: ARGeneratorID
 * @copyright: Copyright 2016-2027 Markor Investment Group Co. LTD. All Rights Reserved.
 * @description:<描述>
 * @author: hexinlei
 * @date: 16/7/22-下午1:05
 * @version: 1.0
 * @since: JDK 1.8
 */
public class ARGeneratorPK extends HibernateDaoSupport implements IdentifierGenerator{
    @Resource(name = "baseGenerateNoStrategies")
    private ARBaseGenerateNoStrategies baseGenerateNoStrategies;

    @Override
    public Serializable generate(SessionImplementor sessionImplementor, Object o) throws HibernateException {
        String uuid = baseGenerateNoStrategies.generateNo();
        return uuid;
    }
}
