package Springproject3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ClassA {
    public static void main(String[] args) {
        ApplicationContext context =new AnnotationConfigApplicationContext(projectconfig.class);

    }
}
