package ru.job4j.condition;

public class Point {

    public static double distance(int x1, int y1, int x2, int y2) {
        double xPow = Math.pow((x2 - x1), 2);
        double yPow = Math.pow((y2 - y1), 2);
        return Math.sqrt(xPow + yPow);
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
        result = Point.distance(10, 10, 20, 10);
        System.out.println("result (10, 10) to (20, 10) " + result);
        result = Point.distance(-10, 10, 20, -10);
        System.out.println("result (-10, 10) to (20, -10) " + result);
    }
}
