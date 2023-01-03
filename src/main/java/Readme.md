Spring project .. 
step1.we are create spring project two type bean and 
annotation  
using bean 
step1. create xml file using resoureces folder
we are use <?xml version="1.0" encoding="utf-8" ?>add 
this and inside the benans and sheama for spring.com site se
//<bean id ="vechile" class="com.spring.Car"></bean>
<bean id ="e" class="com.spring.VechileNoise">
<constructor-arg ref="vechile"/>
</bean>//
step2 we are create main class and create the object 
of vechile
// ApplicationContext context =new ClassPathXmlApplicationContext("config.xml");
//VechileNoise obj =(VechileNoise) context.getBean("e");
run spring using bean 
using confriguration 

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

for testing purpose we are usign this commond on spring
ApplicationContext context =new AnnotationConfigApplicationContext(Appconfig.class);

       ApplicationContext context =new AnnotationConfigApplicationContext(Appconfig.class);
        VechileNoise obj =(VechileNoise) context.getBean("raj");


