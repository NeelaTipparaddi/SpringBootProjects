package org.example.config;

import org.example.Alien;
import org.example.Computer;
import org.example.Desktop;
import org.example.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("org.example")
public class AppConfig {

//@Bean
//   public Desktop desktop(){
//        return new Desktop();
//    };

//    @Bean
//    public Alien alien(Computer com){  //@Qualifier("beast")
//        Alien obj = new Alien();
//        obj.setAge(35);
//        obj.setCom(com);
//        return obj;
//    }
//
//    @Bean(name={"com2","desktop1","beast"})
////    @Scope("prototype")
//    public Desktop desktop(){
//        return new Desktop();
//    };
//
//    @Bean
//    @Primary
////    @Scope("prototype")
//    public Laptop laptop(){
//        return new Laptop();
//    };

}
