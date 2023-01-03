package com.spring;
import com.spring.config.Appconfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

       // ApplicationContext context =new ClassPathXmlApplicationContext("config.xml");

     ApplicationContext context =new AnnotationConfigApplicationContext(Appconfig.class);

        //VechileNoise obj =(VechileNoise) context.getBean("e");
        VechileNoise obj =(VechileNoise) context.getBean("raj");

        obj.run();

    }
}
