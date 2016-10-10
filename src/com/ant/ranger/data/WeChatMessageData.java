package com.ant.ranger.data;

/**
 * @packgeName: com.ant.ranger.data
 * @ClassName: WeChatMessageData
 * @copyright: Copyright 2016-2027 Markor Investment Group Co. LTD. All Rights Reserved.
 * @description:<描述>
 * @author: hexinlei
 * @date: 16/10/2-下午6:07
 * @version: 1.0
 * @since: JDK 1.8
 */
public class WeChatMessageData {
    private String ToUserName;  //开发者微信号
    private String FromUserName;    //发送方帐号（一个OpenID）
    private long CreateTime;  //消息创建时间 （整型）
    private String MsgType; //消息类型(TEXT/image/voice)
    private String MsgID; //消息id，64位整型

    public String getToUserName() {
        return ToUserName;
    }

    public void setToUserName(String toUserName) {
        ToUserName = toUserName;
    }

    public String getFromUserName() {
        return FromUserName;
    }

    public void setFromUserName(String fromUserName) {
        FromUserName = fromUserName;
    }

    public long getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(long createTime) {
        CreateTime = createTime;
    }

    public String getMsgType() {
        return MsgType;
    }

    public void setMsgType(String msgType) {
        MsgType = msgType;
    }

    public String getMsgID() {
        return MsgID;
    }

    public void setMsgID(String msgID) {
        MsgID = msgID;
    }
}
