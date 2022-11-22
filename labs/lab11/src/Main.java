import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        String text = "SGksodgoksdg 20 RUB dfjigdsfjghi 30.85 USD";

        Pattern pat = Pattern.compile("(\\d+(?:\\.\\d+)?) (USD|RUB|EU)");

        Matcher matcher = pat.matcher(text);

        while (matcher.find()) {
            System.out.println("> " + matcher.group() + " [" + matcher.group() + "]");
        }
    }
}
