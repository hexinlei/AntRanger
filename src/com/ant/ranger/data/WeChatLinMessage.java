package com.ant.ranger.data;

/**
 * @packgeName: com.ant.ranger.data
 * @ClassName: WeChatLinMessage
 * @copyright: Copyright 2016-2027 Markor Investment Group Co. LTD. All Rights Reserved.
 * @description:<描述>
 * @author: hexinlei
 * @date: 16/10/2-下午6:19
 * @version: 1.0
 * @since: JDK 1.8
 */
public class WeChatLinMessage extends WeChatMessageData{

    private String Title;
    private String Description;
    private String Url;

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }
}
