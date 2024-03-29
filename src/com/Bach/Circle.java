package com.Bach;

public class Circle extends Shape {
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle radius is ="
                + getRadius()
                + "\n"
                +  "Circle area is :"
                + getArea()
                + "\n"
                + "which is a subclass of "
                + super.toString();
    }



    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public void resize(double percent) {
        double percentRadius = this.radius * percent / 100;
        this.radius += percentRadius;
    }
}
