package com.ant.ranger.entity;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import javax.persistence.*;

/**
 * @packgeName: com.ant.ranger.entity
 * @ClassName: owner
 * @copyright: Copyright 2016-2027 Markor Investment Group Co. LTD. All Rights Reserved.
 * @description:<描述>
 * @author: hexinlei
 * @date: 16/8/30-下午5:17
 * @version: 1.0
 * @since: JDK 1.8
 */
@Entity
public class Owner extends User{
//
//    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
//    @JoinColumn(name = "catalog",referencedColumnName = "pk")
//    @NotFound(action = NotFoundAction.IGNORE)
//    private Catalog catalog;
//
//    public Catalog getCatalog() {
//        return catalog;
//    }
//
//    public void setCatalog(Catalog catalog) {
//        this.catalog = catalog;
//    }
//
//    public Owner(Catalog catalog) {
//        this.catalog = catalog;
//    }
//
//    public Owner() {
//    }
}
