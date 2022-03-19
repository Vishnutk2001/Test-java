package com.harman.java;

import java.awt.*;

public abstract class Shapes {
    abstract void RectangularArea(float l, float b);
    abstract void SquareArea(int a);
    abstract void CircleArea(double s);

}
class Area extends Shapes{

    void RectangularArea(float l, float b) {
        double AreaRectangle = l * b;
        System.out.println("Area Rectangle");

    }
    void SquareArea(int a){
        int AreaSquare = a*a;
        System.out.println("Area Square");
    }
    void CircleArea(double s){
        double AreaCircle = (22*s*s)/7;
        System.out.println("Area Circle");
    }

    public static void main(String[] args) {
        Area a = new Area();

        a.RectangularArea(2,4);


        a.SquareArea(4);


        a.CircleArea(3);
    }
}