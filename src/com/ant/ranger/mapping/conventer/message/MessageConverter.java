package com.ant.ranger.mapping.conventer.message;

import com.ant.ranger.data.MessageData;
import com.ant.ranger.entity.Message;
import com.ant.ranger.mapping.conventer.AbstractPopulatorConverter;
import com.ant.ranger.mapping.populator.message.MessagePopulator;
import org.springframework.core.convert.ConversionException;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @packgeName: com.ant.ranger.mapping.conventer.message
 * @ClassName: MessageConverter
 * @copyright: Copyright 2016-2027 Markor Investment Group Co. LTD. All Rights Reserved.
 * @description:<描述>
 * @author: hexinlei
 * @date: 16/8/3-下午12:38
 * @version: 1.0
 * @since: JDK 1.8
 */
public class MessageConverter extends AbstractPopulatorConverter<Message,MessageData>{

    @Override
    public MessageData convert(Message message) throws ConversionException {
        MessageData target = this.createTarget();
        populator(message,target);
        return target;
    }

    @Override
    protected MessageData createTarget() {
        return new MessageData();
    }
}
