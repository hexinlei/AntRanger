package com.ant.ranger.mapping.populator.message;

import com.ant.ranger.data.MessageData;
import com.ant.ranger.data.UserData;
import com.ant.ranger.data.VisitorData;
import com.ant.ranger.entity.Message;
import com.ant.ranger.entity.Visitor;
import com.ant.ranger.mapping.conventer.user.UserReverseConventer;
import com.ant.ranger.mapping.conventer.user.VisitorReverseConventer;
import com.ant.ranger.mapping.populator.AbstractPopulator;
import com.ant.ranger.mapping.populator.user.UserReversePopulator;
import com.ant.ranger.service.user.UserService;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @packgeName: com.ant.ranger.mapping.populator.message
 * @ClassName: MessageReversePopulator
 * @copyright: Copyright 2016-2027 Markor Investment Group Co. LTD. All Rights Reserved.
 * @description:<描述>
 * @author: hexinlei
 * @date: 16/8/18-下午4:46
 * @version: 1.0
 * @since: JDK 1.8
 */
public class MessageReversePopulator implements AbstractPopulator<MessageData,Message>{

    @Resource
    private VisitorReverseConventer visitorReverseConventer;

    @Resource
    private UserService userService;

    @Override
    public void populator(MessageData messageData, Message message) {
        VisitorData visitorData = messageData.getVisitorData();
        if (null != visitorData) {

            String email = visitorData.getEmail();
            Visitor visitor = (Visitor) userService.findUserByEmail(email);

            if (null==visitor){
                visitor = visitorReverseConventer.convert(visitorData);
                userService.saveUser(visitor);
            }
            message.setVisitor(visitor);
        }
        String common = messageData.getCommon();
        if (StringUtils.isNotEmpty(common)){
            message.setCommon(common);
        }
    }
}
