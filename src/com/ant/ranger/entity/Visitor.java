package com.ant.ranger.entity;

import com.sun.tools.javac.api.ClientCodeWrapper;
import com.sun.xml.internal.rngom.parse.host.Base;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * @packgeName: com.ant.ranger.entity
 * @ClassName: Visitor
 * @copyright: Copyright 2016-2027 Markor Investment Group Co. LTD. All Rights Reserved.
 * @description:<描述>
 * @author: hexinlei
 * @date: 16/7/29-下午5:34
 * @version: 1.0
 * @since: JDK 1.8
 */
@Entity
public class Visitor extends User{

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "message",referencedColumnName = "pk")
    private Set<Message> messages = new HashSet<>();


    public Visitor(Set<Message> messages) {
        this.messages = messages;
    }

    public Visitor() {
    }

    public Set<Message> getMessages() {
        return messages;
    }

    public void setMessages(Set<Message> messages) {
        this.messages = messages;
    }
}
