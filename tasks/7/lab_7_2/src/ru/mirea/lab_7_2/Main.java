package ru.mirea.lab_7_2;

import java.util.LinkedList;

public class Main {

    /**
     * Просто выполнение методов LinkedList
     * Изучите работу LinkedList в интернете. По сути связный список
     * @param args
     */
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("Hey");
        linkedList.add("AIFOSDGJSDG");

        System.out.println(linkedList.indexOf("AIFOSDGJSDG"));

        linkedList.remove("Hey");

        System.out.println(linkedList);

        System.out.println(linkedList.contains("Hey"));
    }
}
