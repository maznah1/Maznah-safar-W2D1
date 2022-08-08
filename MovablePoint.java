package Packagelap4;

public class MovablePoint implements Movable {

    int x;
    int y;
    int xSpeed;
    int ySpeed;

    public MovablePoint(int x,int y,int xSpeed, int ySpeed){};

    @Override
    public String toString() {
        return "MovablePoint{" +
                "x=" + x +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }
    @Override
    public void moveUp() {
      y -= ySpeed;

    }

    @Override
    public void moveDown() {
        y+=ySpeed;

    }

    @Override
    public void moveLeft() {
        x -=xSpeed;

    }

    @Override
    public void moveRight() {
        y +=ySpeed;

    }
}
