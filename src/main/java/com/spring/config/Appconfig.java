package com.spring.config;

import com.spring.Car;
import com.spring.Vechicle;
import com.spring.VechileNoise;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Appconfig {
    @Bean
    public Vechicle vechicle(){
        return new Car();
    }

    @Bean(name = "raj")
public VechileNoise vechileNoise(){
        return new VechileNoise(vechicle());
}
}
