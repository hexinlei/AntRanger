package com.ant.ranger.data;

/**
 * @packgeName: com.ant.ranger.data
 * @ClassName: WeChatVidMessageData
 * @copyright: Copyright 2016-2027 Markor Investment Group Co. LTD. All Rights Reserved.
 * @description:<描述>
 * @author: hexinlei
 * @date: 16/10/2-下午6:16
 * @version: 1.0
 * @since: JDK 1.8
 */
public class WeChatVidMessageData extends WeChatMessageData{
    private String MediaId; //视频消息媒体id，可以调用多媒体文件下载接口拉取数据
    private String ThumbMediaId;    //视频消息缩略图的媒体id，可以调用多媒体文件下载接口拉取数据

    public String getMediaId() {
        return MediaId;
    }

    public void setMediaId(String mediaId) {
        MediaId = mediaId;
    }

    public String getThumbMediaId() {
        return ThumbMediaId;
    }

    public void setThumbMediaId(String thumbMediaId) {
        ThumbMediaId = thumbMediaId;
    }
}
