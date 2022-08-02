package ru.job4j.calculator;

public class Fit {

    public static double manWeight(short height) {
        return (height - 100) * 1.15;
    }

    public static double womanWeight(short height) {
        return (height - 110) * 1.15;
    }

    public static void main(String[] args) {
        short height = 172;
        double man = Fit.manWeight(height);
        System.out.println("Man 172 is " + man);
        height = 159;
        double woman = Fit.womanWeight(height);
        System.out.println("Woman 159 is " + woman);
    }
}
