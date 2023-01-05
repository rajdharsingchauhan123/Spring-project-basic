package Setterbasedcontainer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Springmain {
    public static void main(String[] args) {
        ApplicationContext context =new ClassPathXmlApplicationContext("Collection.xml");
        JavaCollection jc=(JavaCollection) context.getBean("JavaCollection");
        jc.getAddressList();
        jc.getAddressSet();
        jc.getAddressMap();
        jc.getAddressProp();
    }
}
