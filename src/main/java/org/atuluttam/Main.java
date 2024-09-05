package org.atuluttam;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");


        ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");

        Student s = (Student) ctx.getBean("s1");
        s.doAssignment();

    }
}