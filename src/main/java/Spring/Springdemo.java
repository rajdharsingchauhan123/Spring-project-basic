package Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Springdemo {
    public static void main(String[] args) {
        ApplicationContext context =new AnnotationConfigApplicationContext(Springconfig.class);
        A b =(A)context.getBean(A.class);
        //System.out.println(b.toString());
        b.setX(12);
        b.setX(1234);

        System.out.println(b.getX());
    }
}
