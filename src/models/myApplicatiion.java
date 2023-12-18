package models;

import java.io.File;
import java.util.Scanner;

public class myApplicatiion {
    public static void main(String[] args){
        File file=new File("path to file");
        Scanner scan=new Scanner(file);
        Shape shape =new Shape();

        while(scan.hasNext()){
            double x=scan.nextDouble();
            double y = scan.nextDouble();
            shape.addPoint(new Point(x, y));
        }
        shape.addPoint(new Point(x,y));
        System.out.println(shape.calculatePerimeter);
        System.out.println(shape.getLongest);
    }
}
