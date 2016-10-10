package com.ant.ranger.servlet;

import com.ant.ranger.data.WeChatLinMessage;
import com.ant.ranger.data.WeChatTextMessageData;
import com.ant.ranger.util.ReadFileUtil;
import com.ant.ranger.util.WeChatUtil;
import org.dom4j.DocumentException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.NoSuchAlgorithmException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @packgeName: com.ant.ranger.servlet
 * @ClassName: WeChatServlet
 * @copyright: Copyright 2016-2027 Markor Investment Group Co. LTD. All Rights Reserved.
 * @description:<描述>
 * @author: hexinlei
 * @date: 16/10/2-下午7:08
 * @version: 1.0
 * @since: JDK 1.8
 */
public class WeChatServlet extends HttpServlet{
    private static String PATH = Thread.currentThread().getContextClassLoader().getResource("/").getPath();
    private static String MESSAGE_TEXT = "text";
    private static String MESSAGE_IMAGE = "image";
    private static String MESSAGE_VOICE = "voice";
    private static String MESSAGE_VIDEO = "video";
    private static String MESSAGE_SHORTVIDEO = "shortvideo";
    private static String MESSAGE_LOCATION = "location";
    private static String MESSAGE_LINK = "link";
    private static String MESSAGE_EVENT = "event";
    private static String MESSAGE_SUBSCRIBE = "subscribe";
    private static String MESSAGE_UNSUBSCRIBE = "unsubscribe";
    private static String MESSAGE_CLICK = "CLICK";
    private static String MESSAGE_VIEW = "VIEW";

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String signature = request.getParameter("signature");
        String timestamp = request.getParameter("timestamp");
        String nonce = request.getParameter("nonce");
        String echostr = request.getParameter("echostr");

        try {
            if (WeChatUtil.checkToken(signature,timestamp,nonce)){
                PrintWriter writer = response.getWriter();
                writer.print(echostr);
                writer.flush();
                writer.close();
            }
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }

    /**
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        Map<String,String> requestMap = null;
        try {
            requestMap = WeChatUtil.xmlMessageToMap(request);
        } catch (DocumentException e) {
            e.printStackTrace();
        }
        String content = requestMap.get("Content");
        String toUserName = requestMap.get("ToUserName");;
        String fromUserName = requestMap.get("FromUserName");
        String msgType = requestMap.get("MsgType");

        switch (msgType){
            case "text":
                break;
            case "image":
                break;
            case "voice":
                break;
            case "video":
                break;
            case "shortvideo":
                break;
            case "location":
                break;
            case "link":
                break;
            case "event":
                break;
            case "subscribe":
                break;
            case "unsubscribe":
                break;
            case "CLICK":
                break;
            case "VIEW":
                break;
            default:
                break;
        }




        String linkToken = new String(ReadFileUtil.readPropertyFile(PATH+"/resources/config/constant.properties").getProperty("linkConstans").getBytes("ISO-8859-1"),"UTF-8");
        if (content.equals(linkToken)){
            String linkAddress = ReadFileUtil.readPropertyFile(PATH+"resources/config/constant.properties").getProperty("lintAddress");
            String linkTitle = new String(ReadFileUtil.readPropertyFile(PATH+"resources/config/constant.properties").getProperty("lintTitle").getBytes("ISO-8859-1"),"UTF-8");
            String linkDesc = new String(ReadFileUtil.readPropertyFile(PATH+"resources/config/constant.properties").getProperty("lintDesc").getBytes("ISO-8859-1"),"UTF-8");;
            WeChatTextMessageData textMessageData = new WeChatTextMessageData();
            textMessageData.setFromUserName(toUserName);
            textMessageData.setToUserName(fromUserName);
            textMessageData.setContent(linkTitle+linkDesc+linkAddress);
            textMessageData.setMsgType("text");
            textMessageData.setCreateTime(new Date().getTime());
            String returnMessage = WeChatUtil.textMessageToXml(textMessageData);
            System.out.println(returnMessage);
            PrintWriter writer = response.getWriter();
            writer.print(returnMessage);
            writer.flush();
            writer.close();
        }else {
            WeChatTextMessageData textMessageData = new WeChatTextMessageData();
            textMessageData.setFromUserName(toUserName);
            textMessageData.setToUserName(fromUserName);
            textMessageData.setContent("测试");
            textMessageData.setMsgType("text");
            textMessageData.setCreateTime(new Date().getTime());
            String returnMessage = WeChatUtil.textMessageToXml(textMessageData);
            System.out.println(returnMessage);
            PrintWriter writer = response.getWriter();
            writer.print(returnMessage);
            writer.flush();
            writer.close();
        }
    }
}
