package Packagelap3;

public class ResizableCircle extends Circle implements Resizable {


    public ResizableCircle(double radius) {
        super(radius);
    }

    @Override
    public String toString() {
        return "ResizableCircle{" +
                "radius=" + radius +
                '}';
    }

    public void recize (int percent){

        radius*=percent/100.0;

    }

}
