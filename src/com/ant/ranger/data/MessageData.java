package com.ant.ranger.data;

/**
 * @packgeName: com.ant.ranger.data
 * @ClassName: MessageData
 * @copyright: Copyright 2016-2027 Markor Investment Group Co. LTD. All Rights Reserved.
 * @description:<描述>
 * @author: hexinlei
 * @date: 16/7/29-下午5:29
 * @version: 1.0
 * @since: JDK 1.8
 */
public class MessageData {

    private String common;

    private VisitorData visitorData;

    public String getCommon() {
        return common;
    }

    public void setCommon(String common) {
        this.common = common;
    }

    public VisitorData getVisitorData() {
        return visitorData;
    }

    public void setVisitorData(VisitorData visitorData) {
        this.visitorData = visitorData;
    }
}
