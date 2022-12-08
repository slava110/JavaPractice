package lab_10_1;

import java.io.File;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    private static void task1() {
        Integer[] numbers = {10, 20, 30, 40};
        List<Integer> numbersList = toList(numbers);

        System.out.println("Converted numbers: " + numbersList);
    }

    private static void task2() {
        ArrayContainer<String> myContainer = new ArrayContainer<>(new String[10]);

        myContainer.set(3, "Wow");
        myContainer.set(5, "Hey");

        System.out.println(myContainer);
    }

    private static void task3() {
        Integer[] numbers = {10, 20, 30, 40};
        System.out.println(numbers[3] + " == " + getFromArray(numbers, 3));
    }

    private static void task4() {
        File file = new File(".");
        String[] files = file.list();

        if(files == null) {
            System.out.println("Not enough elements in dir!");
            return;
        }

        ArrayContainer<String> myCont = new ArrayContainer<>(files);
        for (int i = 0; i < 5 && i < files.length; i++) {
            System.out.println("> " + myCont.get(i));
        }
    }

    // Комбинирует 2 условия. N должен быть числом и должен быть сравниваемым с N.
    private static <N extends Number & Comparable<N>> List<N> toList(N[] arr) {
        return Arrays.asList(arr);
    }

    private static <T> T getFromArray(T[] arr, int index) {
        return arr[index];
    }

    static class ArrayContainer<T> {
        private final T[] arr;

        public ArrayContainer(T[] arr) {
            this.arr = arr;
        }

        public T get(int i) {
            return arr[i];
        }

        public void set(int i, T value) {
            arr[i] = value;
        }

        @Override
        public String toString() {
            return "ArrayContainer{" +
                    "arr=" + Arrays.toString(arr) +
                    '}';
        }
    }
}