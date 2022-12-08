package lab_11_1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

        System.out.println("Are arguments taking something? " + Solution.areTakingSomething(
                new Solution.Pair<>("Hey", 15),
                new Solution.Pair<>("Wow", 23)
        ));
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

        // Шуточный метод, уберите у себя
        public static boolean areTakingSomething(Object ...args) {
            return Arrays.stream(args).allMatch(arg -> arg instanceof Solution.Pair);
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
