package com.sa.SectionNB.LectureNine;

/**
 * Created by akashs on 6/18/17.
 */
public class Application {
    public static void main(String[] args) {
        Application app = new Application();
        Box triangle;
        triangle = new Triangle(10,20, "General Triangle");
        triangle.display();

        System.out.println(triangle.calArea());
        System.out.println(triangle);
    }
}
