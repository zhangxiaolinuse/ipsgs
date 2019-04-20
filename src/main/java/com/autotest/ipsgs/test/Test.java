package com.autotest.ipsgs.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
    public static void main(String[] args){
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //必须捕获异常
        try {
            Date date1=sdf.parse("2018-09-08 12:30:00");
            System.out.println(date1);
            System.out.println(date1.getTime());
        } catch(ParseException px) {
            px.printStackTrace();
        }
    }
}
