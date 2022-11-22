import java.io.File;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
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

    private static <N extends Number & Comparable<N>> List<N> toList(N[] arr) {
        return Arrays.asList(arr);
    }

    static class ArrayContainer<T> {
        private T[] arr;

        public ArrayContainer(T[] arr) {
            this.arr = arr;
        }

        public T get(int i) {
            return arr[i];
        }

        public List<T> toList() {
            return Arrays.asList(arr);
        }
    }

    static class Solution {

        public static <T> List<T> newArrayList(T ...els) {
            return Arrays.asList(els);
        }

        public static <T> Set<T> newHashSet(T ...els) {
            return new HashSet<>(Arrays.asList(els));
        }

        public static <K, V> Map<K, V> newHashMap(Pair<K, V> ...pairs) {
            Map<K, V> res = new HashMap<>(pairs.length);
            for (Pair<K, V> pair : pairs) {
                res.put(pair.key, pair.value);
            }
            return res;
        }

        static class Pair<K, V> {
            private final K key;
            private final V value;

            public Pair(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }
    }
}