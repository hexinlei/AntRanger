package com.ant.ranger.mapping.message;

import com.ant.ranger.data.MessageData;
import org.springframework.stereotype.Component;

/**
 * @packgeName: com.ant.ranger.mapping.message
 * @ClassName: MessageFacade
 * @copyright: Copyright 2016-2027 Markor Investment Group Co. LTD. All Rights Reserved.
 * @description:<描述>
 * @author: hexinlei
 * @date: 16/8/17-下午12:32
 * @version: 1.0
 * @since: JDK 1.8
 */

public interface MessageFacade {
    void saveMessage(MessageData messageData) throws Exception;
}
