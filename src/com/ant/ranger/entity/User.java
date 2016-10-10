package com.ant.ranger.entity;

import javax.persistence.*;

/**
 * @packgeName: com.ant.ranger.entity
 * @ClassName: User
 * @copyright: Copyright 2016-2027 Markor Investment Group Co. LTD. All Rights Reserved.
 * @description:<描述>
 * @author: hexinlei
 * @date: 16/7/22-上午11:48
 * @version: 1.0
 * @since: JDK 1.8
 */
@Entity
public class User extends BaseEntity{

    @Column(name = "uid",unique = true)
    private String uid;

    @Column(name = "name")
    private String name;

    @Column(name = "email",unique = true)
    private String email;

    @Column(name = "img")
    private String img;

    @Column(name = "selfIntroduction")
    private String selfIntroduction;

    @Column(name = "nickname")
    private String nickname;

    @Column(name = "password")
    private String password;


    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getSelfIntroduction() {
        return selfIntroduction;
    }

    public void setSelfIntroduction(String selfIntroduction) {
        this.selfIntroduction = selfIntroduction;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
