package com.ant.ranger.mapping.conventer.message;

import com.ant.ranger.data.MessageData;
import com.ant.ranger.entity.Message;
import com.ant.ranger.mapping.conventer.AbstractPopulatorConverter;
import com.ant.ranger.mapping.populator.AbstractPopulator;
import com.ant.ranger.mapping.populator.message.MessageReversePopulator;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.core.convert.ConversionException;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @packgeName: com.ant.ranger.mapping.conventer.message
 * @ClassName: MessageReverseConventer
 * @copyright: Copyright 2016-2027 Markor Investment Group Co. LTD. All Rights Reserved.
 * @description:<描述>
 * @author: hexinlei
 * @date: 16/8/18-下午3:47
 * @version: 1.0
 * @since: JDK 1.8
 */
public class MessageReverseConventer extends AbstractPopulatorConverter<MessageData,Message> {

    @Override
    public Message convert(MessageData messageData) throws ConversionException {
        Message target = createTarget();
        populator(messageData,target);
        return target;
    }

    @Override
    protected Message createTarget() {
        return new Message();
    }
}
