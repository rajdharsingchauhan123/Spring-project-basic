package Com.Springproject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class Empconfig {


    @Bean(name="raj")
    public Employee employee(){
        return new Employee(5,"raj");
    }




}
