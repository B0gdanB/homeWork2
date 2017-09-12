package com.home.work;

/**
 * Created by Администратор on 08.09.2017.
 */
public class Rectangle extends Figure{
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getB() {
        return b;
    }

    @Override
    public String getName () {
        return super.getName() + "I’m a object # 1";
    }

    @Override
    public double getArea(){
        return a * b;
    }
}
