import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLOutput;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld beanHello =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(beanHello.getMessage());

        Cat beanCat = (Cat) applicationContext.getBean("cat");
        System.out.println(beanCat.getMessage());
        Cat beanCat2 = (Cat) applicationContext.getBean("cat");
        System.out.println(beanCat2.getMessage());

        System.out.println(bean.equals(beanHello));
        System.out.println(beanCat.equals(beanCat2));

    }
}