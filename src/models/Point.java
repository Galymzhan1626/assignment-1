package models;
import java.lang.Math;
import java.util.ArrayList;

public class Point {
    private double x;
    private double y;

    public Point() {
        this.x = x;
        this.y = y;
    }
    public ArrayList<Double> distances;

    public void distance(double x, double y){
        distances.add(Math.sqrt(Math.pow(x-this.x, 2) + Math.pow(y-this.y, 2)));
    }

}

// toString