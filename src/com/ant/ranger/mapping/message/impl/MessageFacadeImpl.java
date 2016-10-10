package com.ant.ranger.mapping.message.impl;

import com.ant.ranger.data.MessageData;
import com.ant.ranger.entity.Message;
import com.ant.ranger.entity.Visitor;
import com.ant.ranger.mapping.conventer.message.MessageReverseConventer;
import com.ant.ranger.mapping.message.MessageFacade;
import com.ant.ranger.service.message.MessageService;
import com.ant.ranger.service.user.UserService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @packgeName: com.ant.ranger.mapping.message.impl
 * @ClassName: MessageFacadeImpl
 * @copyright: Copyright 2016-2027 Markor Investment Group Co. LTD. All Rights Reserved.
 * @description:<描述>
 * @author: hexinlei
 * @date: 16/8/18-下午5:43
 * @version: 1.0
 * @since: JDK 1.8
 */
@Component
public class MessageFacadeImpl implements MessageFacade{

    @Resource
    private MessageReverseConventer messageReverseConventer;

    @Resource
    private MessageService messageService;

    @Override
    public void saveMessage(MessageData messageData) throws Exception {
        try{
            Message message = messageReverseConventer.convert(messageData);

            if (null!=message){
                messageService.addMessage(message);
            }else {
                throw new Exception("保存失败!");
            }
        }catch (Exception e){
            throw e;
        }
    }
}
