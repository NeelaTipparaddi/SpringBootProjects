package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class Alien {
    @Value("39")
    private int age;
//  @Qualifier("com3")
//    @Autowired
    private Computer com;
public Alien(){
    System.out.println("Object Created");
}
//public Alien(int age){
//    System.out.println("Para constructor called");
//    this.age = age;
//}

//@ConstructorProperties({"laptop","age"})
//    public Alien(Computer laptop, int age) {
//        this.laptop = laptop;
//        this.age = age;
//    }

    public int getAge() {
        return age;
    }
    public void setAge(int age){
    this.age = age;
    }


//    public Computer getLaptop() {
//        return laptop;
//    }
//
//    public void setLaptop(Computer laptop) {
//        this.laptop = laptop;
//    }


    public Computer getCom() {
        return com;
    }
    @Autowired
    @Qualifier("laptop")
    public void setCom(Computer com) {
        this.com = com;
    }

    public void code(){
        System.out.println("Coding");
        com.compile();
    }


}
