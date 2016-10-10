package com.ant.ranger.mapping.populator.message;

import com.ant.ranger.data.MessageData;
import com.ant.ranger.data.VisitorData;
import com.ant.ranger.entity.Message;
import com.ant.ranger.mapping.conventer.user.UserConventer;
import com.ant.ranger.mapping.conventer.user.VisitorConventer;
import com.ant.ranger.mapping.populator.AbstractPopulator;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @packgeName: com.ant.ranger.mapping.populator.message
 * @ClassName: MessagePopulator
 * @copyright: Copyright 2016-2027 Markor Investment Group Co. LTD. All Rights Reserved.
 * @description:<描述>
 * @author: hexinlei
 * @date: 16/8/12-下午1:15
 * @version: 1.0
 * @since: JDK 1.8
 */

public class MessagePopulator implements AbstractPopulator<Message, MessageData> {

    @Resource
    private UserConventer userConventer;

    @Override
    public void populator(Message source, MessageData target) {

        if (StringUtils.isNotEmpty(source.getCommon())){
            target.setCommon(source.getCommon());
        }

        if (null != source.getVisitor()){
            target.setVisitorData((VisitorData) userConventer.convert(source.getVisitor()));
        }

    }
}
