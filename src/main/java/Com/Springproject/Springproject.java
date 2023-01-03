package Com.Springproject;

import com.spring.config.Appconfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Springproject {
    public static void main(String[] args) {
     //   ApplicationContext context=new ClassPathXmlApplicationContext("Employee.xml");
        ApplicationContext context =new AnnotationConfigApplicationContext(Empconfig.class);
//        Employee employee = (Employee) context.getBean("e");
        Employee employee = (Employee) context.getBean("raj");

        employee.show();
    }
}
