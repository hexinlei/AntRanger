package com.ant.ranger.service.message;

import com.ant.ranger.entity.Message;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @packgeName: com.ant.ranger.service.message
 * @ClassName: MessageService
 * @copyright: Copyright 2016-2027 Markor Investment Group Co. LTD. All Rights Reserved.
 * @description:<描述>
 * @author: hexinlei
 * @date: 16/7/29-下午5:58
 * @version: 1.0
 * @since: JDK 1.8
 */

public interface MessageService {
    void addMessage(Message message);
}
