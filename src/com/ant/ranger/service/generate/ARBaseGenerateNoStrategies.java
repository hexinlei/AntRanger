package com.ant.ranger.service.generate;

import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * @packgeName: com.ant.ranger.service.generate
 * @ClassName: ARGenerateNo
 * @copyright: Copyright 2016-2027 Markor Investment Group Co. LTD. All Rights Reserved.
 * @description:<描述>
 * @author: hexinlei
 * @date: 16/7/22-下午1:16
 * @version: 1.0
 * @since: JDK 1.8
 */

public class ARBaseGenerateNoStrategies {

    private int length;
    private String template;

    public ARBaseGenerateNoStrategies(int length, String template) {
        this.length = length;
        this.template = template;
    }

    public String generateNo(){
        String uuid = "";

        String maxValue = "";
        for(int i=0;i<this.length-1;i++){
            maxValue+=9;
        }

        int radomInt = new Random().nextInt(Integer.parseInt(maxValue));
        String radomStr = String.valueOf(radomInt);

        if (radomStr.length()<this.getLength()){
            radomStr = String.format("%0"+(length-1)+"d",radomInt);
        }

        if (this.template.contains("$")){
            uuid = this.template.replace("$",radomStr);
            return uuid;
        }

        uuid = radomStr;
        return uuid;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }
}
