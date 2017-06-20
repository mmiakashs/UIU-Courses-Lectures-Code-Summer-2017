package com.sa.FourthLab;

/**
 * Created by akashs on 6/18/17.
 */
public class Triangle extends Box {

    public String name;

    public double calArea() {
        return 0.5*getWidth()*getHeight();
    }

    public Triangle(double width, double height, String name) {
        super(width, height, 0);
        this.name = name;
    }

    public Triangle(double width, double height, double depth) {
        //super(width, height, depth);
        super();
    }

    public void display(){
        System.out.println(name);
        super.display();
    }
    public void display(String id){
        System.out.println(name+" "+id);
        super.display();
    }
}









