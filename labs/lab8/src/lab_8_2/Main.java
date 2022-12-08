package lab_8_2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("myFile.txt"));
            String line = reader.readLine();
            while(line != null) {
                System.out.println(line);
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Unable to read file: " + e.getMessage());
        }
    }
}
