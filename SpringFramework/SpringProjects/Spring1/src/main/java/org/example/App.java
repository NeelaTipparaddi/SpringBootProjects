package org.example;

import org.example.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import javax.crypto.SecretKey;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Alien obj = context.getBean(Alien.class);
//        obj.setAge(20);
        System.out.println(obj.getAge());
        obj.code();
        //Desktop dt = context.getBean(Desktop.class);
//        Desktop dt1 = context.getBean("beast", Desktop.class);
//        Desktop dt1 = context.getBean(Desktop.class);
//        Desktop dt2 = context.getBean(Desktop.class);
//        dt2.compile();
//        dt1.compile();





//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        Alien obj = (Alien)context.getBean("alien");
//        Alien obj = context.getBean("alien", Alien.class);
//        obj.setAge(20);
//        System.out.println(obj.getAge());
//        obj.code();


//        Computer com = context.getBean(Computer.class);
//        Desktop obj1 = (Desktop) context.getBean("desktopBean");
//        Desktop obj1 = context.getBean(Desktop.class);

    }
}
