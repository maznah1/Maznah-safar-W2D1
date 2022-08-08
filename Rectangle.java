package Package;

import java.awt.geom.Area;

public class Rectangle extends Shape{

    protected double width=1.0;
    protected  double length=1.0;

    public Rectangle() {

    }

    public Rectangle(double width, double length){}
    public Rectangle(double width, double length , String color,boolean filled){}


    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea(){
        double Area = 0;
        return Area;
    }

    public double getPerimeter() {
        return 0;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }
}
