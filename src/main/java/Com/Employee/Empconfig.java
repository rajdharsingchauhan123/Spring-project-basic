package Com.Employee;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Empconfig {
    @Bean
    public Employee employee(){
        return new Engineer();
    }
    @Bean(name ="Raj")
    public AllEmpdeatail allEmpdeatail(){
        return  new AllEmpdeatail(employee());
    }
}
