package Package;




public class Square extends Rectangle{
    public Square(){};

    public Square (double side){}

    public Square(double side, String color,boolean filles){}

    public double getSide(){
        double side =0;
        return side;
    }
    public void setSide() {

    }
    public void  setWidth(double side){}

    public void setLength(double side){}

    @Override
    public String toString() {
        return "Square{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }
}

