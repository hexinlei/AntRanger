package com.ant.ranger.entity;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @packgeName: com.ant.ranger.entity
 * @ClassName: BaseEntity
 * @copyright: Copyright 2016-2027 Markor Investment Group Co. LTD. All Rights Reserved.
 * @description:<描述>
 * @author: hexinlei
 * @date: 16/7/22-下午12:21
 * @version: 1.0
 * @since: JDK 1.8
 */
@MappedSuperclass
public abstract class BaseEntity implements Serializable{

    @GenericGenerator(name = "generator", strategy = "guid")
    @Id
    @GeneratedValue(generator = "generator")
    @Column(name = "PK")
    private String pk;

    public String getPk() {
        return pk;
    }

    public void setPk(String pk) {
        this.pk = pk;
    }
}
