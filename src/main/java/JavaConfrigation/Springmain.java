package JavaConfrigation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Springmain {
    public static void main(String[] args) {
        ApplicationContext context =new AnnotationConfigApplicationContext(Configdemo.class);
        Helloworld helloworld =(Helloworld) context.getBean(Helloworld.class);
        helloworld.setMessage("Hello World!");
        helloworld.getMessage();
    }
}
