package com.ant.ranger.entity;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * @packgeName: com.ant.ranger.entity
 * @ClassName: catalog
 * @copyright: Copyright 2016-2027 Markor Investment Group Co. LTD. All Rights Reserved.
 * @description:<描述>
 * @author: hexinlei
 * @date: 16/8/30-下午9:39
 * @version: 1.0
 * @since: JDK 1.8
 */
@Entity
public class Catalog extends BaseEntity{

    @Column(unique = true)
    private String code;
    private String name;
    private String description;
    private Integer level;
    private Integer morder;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cid",referencedColumnName = "pk")
    private Catalog parentCatalog;


    @OneToMany(targetEntity = Catalog.class, cascade = { CascadeType.ALL }, mappedBy = "parentCatalog")
    @Fetch(FetchMode.SUBSELECT)
    @OrderBy("morder")
    private Set<Catalog> childCatalogs = new HashSet<>();


    public Set<Catalog> getChildCatalogs() {
        return childCatalogs;
    }

    public void setChildCatalogs(Set<Catalog> childCatalogs) {
        this.childCatalogs = childCatalogs;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getMorder() {
        return morder;
    }

    public void setMorder(Integer morder) {
        this.morder = morder;
    }

    public Catalog getParentCatalog() {
        return parentCatalog;
    }

    public void setParentCatalog(Catalog parentCatalog) {
        this.parentCatalog = parentCatalog;
    }
}
