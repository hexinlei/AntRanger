package com.ant.ranger.service.message.impl;

import com.ant.ranger.dao.base.BaseDao;
import com.ant.ranger.dao.message.MessageDao;
import com.ant.ranger.entity.Message;

import com.ant.ranger.service.message.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @packgeName: com.ant.ranger.service.message.impl
 * @ClassName: MessageServiceImpl
 * @copyright: Copyright 2016-2027 Markor Investment Group Co. LTD. All Rights Reserved.
 * @description:<描述>
 * @author: hexinlei
 * @date: 16/7/29-下午5:59
 * @version: 1.0
 * @since: JDK 1.8
 */
@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
@Service
public class MessageServiceImpl implements MessageService{

    @Resource
    private MessageDao messageDao;

    @Override
    public void addMessage(Message message) {
        System.out.println(message.getCommon());
        messageDao.insert(message);
    }
}
