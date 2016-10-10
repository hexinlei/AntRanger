package com.ant.ranger.dao.base.impl;

import com.ant.ranger.dao.base.BaseDao;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * @packgeName: com.ant.ranger.dao.base.impl
 * @ClassName: BaseDaoImpl
 * @copyright: Copyright 2016-2027 Markor Investment Group Co. LTD. All Rights Reserved.
 * @description:<描述>
 * @author: hexinlei
 * @date: 16/7/29-上午11:55
 * @version: 1.0
 * @since: JDK 1.8
 */
public abstract class BaseDaoImpl<T> implements BaseDao<T>{

    @Autowired
    private SessionFactory sessionFactory;

    private Class<T> entityClazz;

    private Session session;

    public BaseDaoImpl(Class<T> clazz) {
        //this.session = getCurrentSession();
        this.entityClazz = clazz;
    }

    @Override
    public void insert(T t) {
        session = getCurrentSession();

        session.save(t);
    }

    @Override
    public void delete(T t) {
        session = getCurrentSession();

        session.delete(t);
    }

    @Override
    public void update(T t) {
        session = getCurrentSession();

        session.update(t);
    }

    @Override
    public T queryByPK(String pk) {
        session = getCurrentSession();

        return (T) session.get(entityClazz,pk);
    }

    @Override
    public List<T> queryAll() {
        session = getCurrentSession();

        String className = entityClazz.getSimpleName();
        String hql = "from "+className;
        return queryListForParam(hql,null);
    }


    protected List<T> queryListForParam(String hql,final Object [] param){
        session = getCurrentSession();
        Query query = session.createQuery(hql);
        setQueryParams(query,param);
        return query.list();
    }

    protected Session getCurrentSession(){
        return sessionFactory.getCurrentSession();
    }

    private void setQueryParams(Query query, Object[] params) {
        if (null == params) {
            return;
        }
        for (int i = 0; i < params.length; i++) {
            query.setParameter(i, params[i]);
        }
    }

    @Override
    public T createNewInstance(T t) throws IllegalAccessException, InstantiationException {
        return entityClazz.newInstance();
    }
}
