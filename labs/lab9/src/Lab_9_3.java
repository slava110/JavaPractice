public class Lab_9_3 {

    public static void main(String[] args) {
        try {
            String res = getDetails("wow");
            String res2 = getDetails(null);
        } catch (Exception e) {
            System.out.println("Exception! " + e.getMessage());
        }
    }

    public static String getDetails(String key) {
        if(key == null) {
            throw new NullPointerException("Key is null!");
        }

        return key + "_5283958723689";
    }
}
