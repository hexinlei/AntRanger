package com.ant.ranger.data;

/**
 * @packgeName: com.ant.ranger.data
 * @ClassName: WeChatPicMessageData
 * @copyright: Copyright 2016-2027 Markor Investment Group Co. LTD. All Rights Reserved.
 * @description:<描述>
 * @author: hexinlei
 * @date: 16/10/2-下午6:10
 * @version: 1.0
 * @since: JDK 1.8
 */
public class WeChatPicMessageData extends WeChatMessageData{

    private String PicUrl;  //图片链接（由系统生成）
    private String MediaId; //图片消息媒体id，可以调用多媒体文件下载接口拉取数据


    public String getPicUrl() {
        return PicUrl;
    }

    public void setPicUrl(String picUrl) {
        PicUrl = picUrl;
    }

    public String getMediaId() {
        return MediaId;
    }

    public void setMediaId(String mediaId) {
        MediaId = mediaId;
    }
}
