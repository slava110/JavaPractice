package ru.mirea.lab_2_1;

public class CircleTest {

    public static void main(String[] args) {
        Circle cir = new Circle(5);

        System.out.println("Radius: " + cir.getRadius());
        System.out.println("Perimeter: " + cir.getPerimeter());
        System.out.println("Square: " + cir.getSquare());
    }
}