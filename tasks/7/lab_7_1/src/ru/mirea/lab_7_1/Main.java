package ru.mirea.lab_7_1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    /**
     * Просто выполнение методов ArrayList
     * Изучите то, как работает ArrayList, в интернете. По факту это Vector из C++ - расширяемый массив
     * Расширяется в 2 раза если места в нём нехватает
     * @param args
     */
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();

        myList.add("First");
        myList.add("Second");
        myList.add("Third");

        System.out.println(String.join(", ", myList));

        myList.remove(2);

        System.out.println(String.join(", ", myList));

        System.out.println(myList.contains("Third"));
        System.out.println(myList.contains("Second"));

        myList.add("AGFDSOGJDG");
        myList.add("jDSGODSOGOSDGDFIS");

        System.out.println(myList.indexOf("jDSGODSOGOSDGDFIS"));
    }
}
