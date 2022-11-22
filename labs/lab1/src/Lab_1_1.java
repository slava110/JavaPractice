import java.util.stream.IntStream;

public class Lab_1_1 {

    public static void main(String[] args) {
        int[] array = new int[] {1, 10, 50, 100};

        System.out.println(arraySumFor(array));
        System.out.println(arraySumWhile(array));
        System.out.println(arraySumForEach(array));
    }

    /**
     * Сумма чисел массива циклом for
     */
    public static int arraySumFor(int[] array) {
        int res = 0;
        for(int i = 0; i < array.length; i++) {
            res += array[i];
        }
        return res;
    }

    /**
     * Сумма чисел массива циклом while
     */
    public static int arraySumWhile(int[] array) {
        int res = 0;
        int i = 0;
        while(i < array.length) {
            res += array[i];
            i++;
        }
        return res;
    }

    /**
     * Сумма чисел массива циклом for-each
     */
    public static int arraySumForEach(int[] array) {
        int res = 0;
        for(int num : array) {
            res += num;
        }
        return res;
    }
}
