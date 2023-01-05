package Com.Collage;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class Colleageconfig{
    @Bean
    public Princple princplebean(){
        return new Princple();
    }
    @Bean
    // inject the construtor
    public Collage collagebean(){
        return new Collage(princplebean());
    }

}