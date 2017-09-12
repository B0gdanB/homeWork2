package com.home.work;

/**
 * Created by Администратор on 08.09.2017.
 */
public class Circle extends Figure {

    private double r;

    public Circle(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public String getName() {
        return super.getName() + "I’m a object # 3";
    }

    @Override
    public double getArea() {
        return Math.PI * r * r;
    }
}
