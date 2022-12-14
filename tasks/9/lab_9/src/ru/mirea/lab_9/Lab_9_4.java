package ru.mirea.lab_9;

import java.util.Scanner;

public class Lab_9_4 {

    public static void main(String[] args) {
        try {
            getKey();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace(); // Выводит stacktrace - путь вызовов до методов вплоть до ошибки
        }
    }

    private static void getKey() throws Exception {
        Scanner scan = new Scanner(System.in);

        String key = scan.nextLine();
        printDetails(key);
    }

    private static void printDetails(String key) throws Exception {
        try {
            String msg = getDetails(key);
            System.out.println(msg);
        } catch (Exception e) {
            throw e;
        }
    }

    private static String getDetails(String key) throws Exception {
        if(key.equals(""))
            throw new Exception("Empty key!");

        return "data for " + key;
    }
}
