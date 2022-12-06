import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        simple();
        System.out.println("=================");
        prices();
    }

    /**
     * Лолшто. Регулярка для текста... Тут можно было использовать метод строки equals
     * Кстати, через == строки в Java нельзя сравнивать. На всякий
     */
    private static void simple() {
        String text = "abcdefghijklmnopqrstuv18340";

        String correct = "abcdefghijklmnopqrstuv18340";
        String incorrect = "abcdefghijklmnoasdfasdpqrstuv18340";

        Pattern pat = Pattern.compile("^abcdefghijklmnopqrstuv18340$");

        Matcher matcher = pat.matcher(text);

        if(pat.matcher(text).find()) {
            System.out.println("Found in original text");
        }

        if(pat.matcher(correct).find()) {
            System.out.println("Found in correct text");
        }

        if(!pat.matcher(incorrect).find()) {
            System.out.println("Not found in incorrect text");
        }
    }

    private static void prices() {
        String text = "SGksodgoksdg 20 RUB dfjigdsfjghi 30.85 USD";

        // https://regex101.com/r/BU0Z89/1
        // Гляньте регулярные выражения перед сдачей работы
        Pattern pat = Pattern.compile("(\\d+(?:\\.\\d+)?) (USD|RUB|EU)");

        Matcher matcher = pat.matcher(text);

        while (matcher.find()) {
            System.out.println("> " + matcher.group() + " [" + matcher.group() + "]");
        }
    }
}