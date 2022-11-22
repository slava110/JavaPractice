import java.util.Scanner;

public class Lab_9_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer:");
        String intString = scanner.next();
        try {
            int i = Integer.parseInt(intString);
        } catch (Exception e) {
            System.out.println("Common exception");
        }/* catch (NumberFormatException e) {
            System.out.println("Not a number!");
        }*/
        finally {
            System.out.println("BUT IN THE EEEEEEEEEND IT DOESN'T EVEN MAAAATTER");
        }
    }
}
