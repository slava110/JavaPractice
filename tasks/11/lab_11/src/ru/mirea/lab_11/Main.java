package ru.mirea.lab_11;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        List<String> list = Solution.newArrayList("A", "B", "C");
        System.out.println("List: " + list);

        Set<String> set = Solution.newHashSet("A", "B", "C");
        System.out.println("Set: " + set);

        Map<String, Integer> map = Solution.newHashMap(
                new Solution.Pair<>("Hey", 15),
                new Solution.Pair<>("Wow", 23)
        );
        System.out.println("Map: " + map);
    }

    static class Solution {

        public static <T> List<T> newArrayList(T ...els) {
            return Arrays.asList(els); // Метод из встроенной библиотеки
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
