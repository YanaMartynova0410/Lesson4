package org.example.Lesson4;

public class Triangle {
    public static void main(String[] args) {
        System.out.println(new Triangle().triangle(4, 6, 8));
        System.out.println(new Triangle().triangle(8, 14, 8));
        System.out.println(new Triangle().triangle(5, 0, 4));
    }

    public double triangle(double a, double b, double c) {
        double p =(a + b + c)/2;
        double s = Math.sqrt(p*(p-a)*(p-b)*(p-c));

        return s;
    }
}
