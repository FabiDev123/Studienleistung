package utils;

public class Punkt {

    private double x;
    private double y;

    public Punkt(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void changeCoords(double x, double y){
        this.x = x;
        this.y = y;
    }


    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "x: " + x + ", y: " + y;
    }
}
