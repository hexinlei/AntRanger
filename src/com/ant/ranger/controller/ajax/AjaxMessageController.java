package com.ant.ranger.controller.ajax;

import com.ant.ranger.data.MessageData;
import com.ant.ranger.mapping.message.MessageFacade;
import com.apple.eawt.Application;
import org.springframework.context.annotation.Scope;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * @packgeName: com.ant.ranger.controller.ajax
 * @ClassName: AjaxMessageController
 * @copyright: Copyright 2016-2027 Markor Investment Group Co. LTD. All Rights Reserved.
 * @description:<描述>
 * @author: hexinlei
 * @date: 16/8/17-下午3:45
 * @version: 1.0
 * @since: JDK 1.8
 */
@Controller
@RequestMapping("/ajax/message")
public class AjaxMessageController {

    @Resource
    private MessageFacade messageFacade;

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    @ResponseBody
    public Object test(){
        return "success";
    }

    @RequestMapping(value = "/saveMessage",method = RequestMethod.POST,produces= "text/plain;charset=UTF-8")
    @ResponseBody
    public String saveMessage(MessageData messageData) throws Exception {
        messageFacade.saveMessage(messageData);
        return "成功";
    }
}
