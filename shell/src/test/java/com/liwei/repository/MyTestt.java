package com.liwei.repository;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Callable;

import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class MyTestt {
    public static final int SS = 22;

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println();
        }
    }
    @Test
    public void modify() {
        System.out.println();
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Assert.assertEquals("2018-03-07", format.format(date));
        log.info("info/....");
        log.debug("debug.....");
        log.error("error....");
        log.warn("warn.....");

    }
}
