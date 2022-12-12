package ru.mirea.prac_10.task2.chairs;

public class FunctionalChair implements Chair {

    public int sum(int a, int b) {
        return a + b;
    }

    @Override
    public String toString() {
        return "FunctionalChair";
    }
}
