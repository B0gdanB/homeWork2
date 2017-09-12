package com.home.work;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println();

        Triangle triangle1 = new Triangle(15, 8, 8);
        Rectangle rectangle = new Rectangle(4, 8);
        Circle circle = new Circle(10);

        System.out.println(triangle1.getArea() - (rectangle.getArea() / 2));
        System.out.println(rectangle.getArea());
        System.out.println(circle.getArea() - (rectangle.getArea() - (triangle1.getArea() - (rectangle.getArea() / 2))));

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Triangle bean = (Triangle) context.getBean("triangle");
        System.out.println(bean.getArea());
    }

}
