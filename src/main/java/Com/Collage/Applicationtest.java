package Com.Collage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Applicationtest {
    public static void main(String[] args) {
        ApplicationContext context =new AnnotationConfigApplicationContext(Colleageconfig.class);
        Collage collage = context.getBean("collagebean",Collage.class);

        collage.Test();
    }
}
