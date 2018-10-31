package com.liwei.repository;

import ch.qos.logback.core.net.SyslogOutputStream;

import javax.sound.midi.Soundbank;

public class class03 {
    public static int testException(int i) throws Exception{
        try {
            return 5/i;
        }catch (Exception e){
            System.out.println("cath");
            throw new Exception("exception in method");
        }finally {
            System.out.println("finally");
        }
    }

    public static void main(String[] args) {

        try {
            testException(0);
        } catch (Exception e) {
            System.out.println("exception in main");
        }

        System.out.println("finished");
    }
}
