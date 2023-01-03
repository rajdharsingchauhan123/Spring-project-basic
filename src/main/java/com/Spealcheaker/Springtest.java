package com.Spealcheaker;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Springtest {
    public static void main(String[] args) {
        ApplicationContext context =new ClassPathXmlApplicationContext("spellcheaker.xml");
        TextEditor t = (TextEditor) context.getBean("e");
        t.spellCheck();
    }
}
