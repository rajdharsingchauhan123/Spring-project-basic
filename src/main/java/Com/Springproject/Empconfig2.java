package Com.Springproject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource({"classpath:Employee.xml"})// import from xml file
@Import(Empconfig.class)
public class Empconfig2 {



}
