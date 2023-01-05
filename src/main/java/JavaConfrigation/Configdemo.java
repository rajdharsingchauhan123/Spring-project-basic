package JavaConfrigation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configdemo {
    @Bean
    public Helloworld hellowordbean(){
        return new Helloworld();
    }
}
