package com.lts.example.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author Robert HG (254963746@qq.com) on 8/4/15.
 */
public class SpringTaskTrackerAnnotationTest {

    public static void main(String[] args) throws IOException {

        new ClassPathXmlApplicationContext("/spring/lts-tasktracker-annotaion.xml");
        System.in.read();
    }

}
