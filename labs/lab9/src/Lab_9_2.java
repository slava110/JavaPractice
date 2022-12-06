import java.util.Scanner;

public class Lab_9_2 {

    /**
     * Отлов ошибки при попытке конвертировать строку в число
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer:");
        String intString = scanner.next();
        try {
            int i = Integer.parseInt(intString); // Конвертация тут!
        } catch (Exception e) {
            System.out.println("Error!"); // Ошибка!
        }/* catch (NumberFormatException e) { // Для отлова только ошибки конвертации и ничего больше
            System.out.println("Not a number!");
        }*/
        finally {
            System.out.println("BUT IN THE EEEEEEEEEND IT DOESN'T EVEN MAAAATTER");
        }
    }
}
