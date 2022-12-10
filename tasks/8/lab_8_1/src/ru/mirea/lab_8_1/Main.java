package ru.mirea.lab_8_1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    /**
     * Запрашивает у пользователя построчный ввод текста
     * Чтобы завершить ввод надо написать EOF. Только после этого текст запишется в файл
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Type text or enter EOF to write everything to file ");
        Scanner scanner = new Scanner(System.in);

        // Конструкция try-with-resources
        try(FileWriter writer = new FileWriter("myFile.txt", false)) {
            boolean first = true;
            while (true) {
                // Получаем следующую строчку текста
                String text = scanner.next();

                if(first) {
                    first = false;
                } else {
                    // Перенос строчки
                    writer.append('\n');
                }
                if(text.equals("EOF"))
                    break;
                // Записываем введённый текст если он не EOF
                writer.write(text);
            }
            // Смыв в файл))
            writer.flush();
        } catch (IOException e) {
            // Обработка ошибки записи в файл
            System.out.println("Welp, I'm broken :c");
            e.printStackTrace();
        }
    }

}