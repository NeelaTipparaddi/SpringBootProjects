package org.example;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Component("com3")
@Component
public class Laptop implements Computer {
    private Desktop desk1;
    public Laptop() {
        System.out.println("Laptop Object created");
    }

    public Desktop getDesk1() {
        return desk1;
    }

    public void setDesk1(Desktop desk1) {
        this.desk1 = desk1;
    }


    @Override
    public void compile(){
        System.out.println("Compiling in Laptop");
        //desk1.compile();
    }
}
