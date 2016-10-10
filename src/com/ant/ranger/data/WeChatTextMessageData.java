package com.ant.ranger.data;

/**
 * @packgeName: com.ant.ranger.data
 * @ClassName: TextMessageData
 * @copyright: Copyright 2016-2027 Markor Investment Group Co. LTD. All Rights Reserved.
 * @description:<描述>
 * @author: hexinlei
 * @date: 16/10/2-下午5:59
 * @version: 1.0
 * @since: JDK 1.8
 */
public class WeChatTextMessageData extends WeChatMessageData{
    private String Content; //文本消息内容

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

}
