package ru.mirea.lab_8_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        // Конструкция try-with-resources
        try(BufferedReader reader = new BufferedReader(new FileReader("myFile.txt"))) {
            // Переменная для строчек из файла
            String line;
            // Цикл. Одновременно записывает строчку в line и проверяет, не является ли она null (что означает конец
            // файла)
            while( ( line = reader.readLine() ) != null ) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Unable to read file: " + e.getMessage());
        }
    }
}
