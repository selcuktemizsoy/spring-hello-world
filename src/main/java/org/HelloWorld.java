package org;

import org.example.Vehicle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorld {



    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("conf.xml");

        Vehicle obj = (Vehicle) context.getBean("bike");
        obj.drive();
    }
}
