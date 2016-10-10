package com.ant.ranger.data;

/**
 * @packgeName: com.ant.ranger.data
 * @ClassName: WeChatVoiMessageData
 * @copyright: Copyright 2016-2027 Markor Investment Group Co. LTD. All Rights Reserved.
 * @description:<描述>
 * @author: hexinlei
 * @date: 16/10/2-下午6:12
 * @version: 1.0
 * @since: JDK 1.8
 */
public class WeChatVoiMessageData extends WeChatMessageData{

    private String MediaId; //语音消息媒体id，可以调用多媒体文件下载接口拉取该媒体
    private String Format;  //语音格式：amr
    private String Recognition; //语音识别结果，UTF8编码

    public String getMediaId() {
        return MediaId;
    }

    public void setMediaId(String mediaId) {
        MediaId = mediaId;
    }

    public String getFormat() {
        return Format;
    }

    public void setFormat(String format) {
        Format = format;
    }

    public String getRecognition() {
        return Recognition;
    }

    public void setRecognition(String recognition) {
        Recognition = recognition;
    }
}
