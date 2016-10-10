package com.ant.ranger.dao.message.impl;

import com.ant.ranger.dao.base.impl.BaseDaoImpl;
import com.ant.ranger.dao.message.MessageDao;
import com.ant.ranger.entity.Message;
import org.springframework.stereotype.Repository;

/**
 * @packgeName: com.ant.ranger.dao.message
 * @ClassName: MessageDaoImpl
 * @copyright: Copyright 2016-2027 Markor Investment Group Co. LTD. All Rights Reserved.
 * @description:<描述>
 * @author: hexinlei
 * @date: 16/8/18-下午6:07
 * @version: 1.0
 * @since: JDK 1.8
 */
@Repository
public class MessageDaoImpl extends BaseDaoImpl<Message> implements MessageDao {

    public MessageDaoImpl() {
        super(Message.class);
    }
}
