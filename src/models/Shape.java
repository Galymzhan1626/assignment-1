package models;

import jdk.internal.access.JavaIOFileDescriptorAccess;

import java.util.ArrayList;

public class Shape {
    public ArrayList<Point> points;
    private JavaIOFileDescriptorAccess distances;

    public void addPoint(Point point){
        points.add(point);
    }

    public double calculatePerimeter(){
        int i, perimeter=0;
        for(i=0;i<points.size();i++){
            perimeter += distances.get(distances.size() - i);
        }
        return perimeter;
    }
    public int getLongest(){

        return 0;
    }
}