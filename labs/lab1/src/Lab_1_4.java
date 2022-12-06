import java.util.Arrays;
import java.util.Random;

public class Lab_1_4 {

    public static void main(String[] args) {
        // Создание экземпляра класса Random (генератора случайных чисел)
        Random rand = new Random();

        int[] array = new int[10];

        // Заполнение массива случайными числами
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(100); // случайное число от 0 до 99 включительно
        }

        // Вывод массива на экран
        for (int i = 0; i < array.length; i++) {
            System.out.println("[" + i + "] " + array[i]);
        }

        System.out.println("====================");

        // Сортировка массива при помощи библиотечного метода

        // Алгоритм сортировки Dual-Pivot Quicksort от Vladimir Yaroslavskiy, Jon Bentley, и Joshua Bloch.
        // Сложность: O(n log(n))

        Arrays.sort(array);

        // Вывод отсортированного массива на экран
        for (int i = 0; i < array.length; i++) {
            System.out.println("[" + i + "] " + array[i]);
        }
    }
}
