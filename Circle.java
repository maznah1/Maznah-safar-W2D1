package Package;

public class Circle extends Shape {
    protected double radius = 1.0;

    public Circle(){}
    public Circle(double radius){}
    public Circle(double radius,String color,boolean filles){}

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return 0;
    }
    public double getPerimeter(){

       return 0;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
