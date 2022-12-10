package ru.mirea.lab_9;

public class Lab_9_1 {

    /**
     * Вызываем ошибку деления на 0 и ловим её
     * @param args
     */
    public static void main(String[] args) {
        try {
            System.out.println(2 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero");
        }
    }

}
