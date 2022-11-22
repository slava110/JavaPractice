public class Lab_1_5 {

    public static void main(String[] args) {
        System.out.println(calcFactorial(10));
    }

    public static int calcFactorial(int num) {
        int res = 1;
        for (int i = 2; i <= num; i++) {
            res *= i;
        }
        return res;
    }
}
