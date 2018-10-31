package com.liwei.repository;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.hibernate.boot.jaxb.SourceType;

import java.math.BigDecimal;

public class Mytest04 {
    String ab = new String("aa");
    char[] ch = {'s','e','r'};

    public static void main(String[] args) {
        fun();
        fun2();

    }

    public static void  fun(){
        long ss = System.currentTimeMillis();
        Object b;
        for (int i = 0; i < 10000; i++) {
            b = new Object();

        }
        long ee = System.currentTimeMillis();
        System.out.println("任务完成时间2:" + (ee - ss));
    }

    public static void  fun2(){

        long s = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            Object o = new Object();
        }
        long e = System.currentTimeMillis();
        System.out.println("任务完成时间1:" + (e - s));

    }

}
