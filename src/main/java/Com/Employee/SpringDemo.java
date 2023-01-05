package Com.Employee;

import com.spring.App;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo {
    public static void main(String[] args) {
        //ApplicationContext context =new ClassPathXmlApplicationContext("EmployeeandEngi.xml");
        ApplicationContext context =new AnnotationConfigApplicationContext(Empconfig.class);
//        AllEmpdeatail obj =(AllEmpdeatail) context.getBean("e");
        AllEmpdeatail obj =(AllEmpdeatail) context.getBean("Raj");// This is for annotion bean using like this

        obj.showsalary();
    }
}
