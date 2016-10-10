package com.ant.ranger.util;

import com.ant.ranger.data.WeChatMessageData;
import com.thoughtworks.xstream.XStream;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @packgeName: com.ant.ranger.util
 * @ClassName: WeChatUtil
 * @copyright: Copyright 2016-2027 Markor Investment Group Co. LTD. All Rights Reserved.
 * @description:<描述>
 * @author: hexinlei
 * @date: 16/10/2-下午5:40
 * @version: 1.0
 * @since: JDK 1.8
 */
public class WeChatUtil {
    // 微信公众号Token
    private static final String TOKEN = "SpringLei";

    /**
     * 微信公众号口令检测
     * @param signature
     * @param timestamp
     * @param nonce
     * @return
     * @throws NoSuchAlgorithmException
     */
    public static boolean checkToken(String signature,String timestamp,String nonce) throws NoSuchAlgorithmException {
        String array[] = {TOKEN,timestamp,nonce};
        Arrays.sort(array);

        StringBuffer content = new StringBuffer();

        for (String str : array){
            content.append(str);
        }

        String token = SHA1(content.toString());
        return token.equals(signature);
    }

    /**
     * SHA1加密
     * @param decript
     * @return
     * @throws NoSuchAlgorithmException
     */
    public static String SHA1(String decript) throws NoSuchAlgorithmException {
        try {
            MessageDigest digest = java.security.MessageDigest
                    .getInstance("SHA-1");
            digest.update(decript.getBytes());
            byte messageDigest[] = digest.digest();
            // Create Hex String
            StringBuffer hexString = new StringBuffer();
            // 字节数组转换为 十六进制 数
            for (int i = 0; i < messageDigest.length; i++) {
                String shaHex = Integer.toHexString(messageDigest[i] & 0xFF);
                if (shaHex.length() < 2) {
                    hexString.append(0);
                }
                hexString.append(shaHex);
            }
            return hexString.toString();

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return "";
    }

    /**
     * 把微信发送的消息从XML格式转化成Map
     * @param request
     * @return
     * @throws IOException
     * @throws DocumentException
     */
    public static Map<String,String> xmlMessageToMap(HttpServletRequest request) throws IOException, DocumentException {
        InputStream in = request.getInputStream();

        SAXReader reader = new SAXReader();

        Document document = reader.read(in);

        Element rootElement = document.getRootElement();

        List<Element> elementList = rootElement.elements();

        Map<String,String> valueMap = new HashMap<>();

        for (Element element : elementList){
            valueMap.put(element.getName(),element.getText());
        }

        return valueMap;
    }

    /**
     * 消息对象转换成XML
     * @param textMessage
     * @return
     */
    public static String textMessageToXml(WeChatMessageData textMessage){
        XStream stream = new XStream();
        stream.alias("xml",textMessage.getClass());
        return stream.toXML(textMessage);
    }
}
