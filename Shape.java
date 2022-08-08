package Package;

public class Shape {
    public   abstract class Shspe {
        protected String color = "red";
        protected Boolean filled = true;

        public void Shape() {

        }

        public void Shape(Shape color, boolean filled) {
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public boolean isFilles() {
            return false;
        }

        public void setFilled(Boolean filled) {
            this.filled = filled;
        }

        public abstract double getArea();


        public abstract double getPerimeter();

        @Override
        public String toString() {
            return "Shspe{" +
                    "color='" + color + '\'' +
                    ", filled=" + filled +
                    '}';
        }
    }
}
