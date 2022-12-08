package lab_8_1;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
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

        try(FileWriter writer = new FileWriter("myFile.txt", false)) {
            boolean first = true;
            while (true) {
                String text = scanner.next();
                if(first) {
                    first = false;
                } else {
                    writer.append('\n');
                }
                if(text.equals("EOF"))
                    break;
                writer.write(text);
            }
            // Смыв в файл))
            writer.flush();
        } catch (Throwable e) {
            System.out.println("Welp, I'm broken :c");
            e.printStackTrace();
        }
    }

}