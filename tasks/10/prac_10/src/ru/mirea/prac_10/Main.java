package ru.mirea.prac_10;

import ru.mirea.prac_10.task1.Complex;
import ru.mirea.prac_10.task1.ComplexAbstractFactory;
import ru.mirea.prac_10.task1.ConcreteFactory;
import ru.mirea.prac_10.task2.AbstractChairFactory;
import ru.mirea.prac_10.task2.ChairFactory;
import ru.mirea.prac_10.task2.Client;
import ru.mirea.prac_10.task2.chairs.Chair;
import ru.mirea.prac_10.task2.chairs.FunctionalChair;
import ru.mirea.prac_10.task2.chairs.MagicChair;
import ru.mirea.prac_10.task2.chairs.VictorianChair;

public class Main {

    public static void main(String[] args) {
        testComplex();
        System.out.println("-------------");
        testChairBullshit();
    }

    private static void testComplex() {
        ComplexAbstractFactory cf = new ConcreteFactory();

        Complex c1 = cf.createComplex();
        Complex c2 = cf.CreateComplex(10, 20);

        System.out.println(c1);
        System.out.println(c2);
    }

    private static void testChairBullshit() {
        AbstractChairFactory cf = new ChairFactory();

        Client cl = new Client(null);

        cl.sit();

        VictorianChair c1 = cf.createVictorianChair();
        System.out.println("Vict age: " + c1.getAge());
        cl.setChair(c1);
        cl.sit();

        MagicChair c2 = cf.createMagicanChair();
        c2.doMagic();
        cl.setChair(c2);
        cl.sit();

        FunctionalChair c3 = cf.createFunctionalChair();
        System.out.println("Sum: " + c3.sum(3, 5));
        cl.setChair(c3);
        cl.sit();
    }
}
