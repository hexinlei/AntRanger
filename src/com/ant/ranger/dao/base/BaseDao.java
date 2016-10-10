package com.ant.ranger.dao.base;

import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @packgeName: com.ant.ranger.dao
 * @ClassName: BaseDao
 * @copyright: Copyright 2016-2027 Markor Investment Group Co. LTD. All Rights Reserved.
 * @description:<描述>
 * @author: hexinlei
 * @date: 16/7/22-下午1:04
 * @version: 1.0
 * @since: JDK 1.8
 */

public interface BaseDao<T> {

    void insert(T t);

    void delete(T t);

    void update(T t);

    T queryByPK(String pk);

    List<T> queryAll();

    T createNewInstance(T t) throws IllegalAccessException, InstantiationException;
}
