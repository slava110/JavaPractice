package lab_12_1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        simple();
        System.out.println("=================");
        prices();
        checkNumbers();
        checkEmail();
        checkPass();
    }

    /**
     * Лолшто. Регулярка для текста... Тут можно было использовать метод строки equals
     * Кстати, через == строки в Java нельзя сравнивать. На всякий
     */
    private static void simple() {
        String correct = "abcdefghijklmnopqrstuv18340";
        String incorrect = "abcdefghijklmnoasdfasdpqrstuv18340";

        // ^ - начало строки, $ - конец строки
        Pattern pat = Pattern.compile("^abcdefghijklmnopqrstuv18340$");

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
        // `\\` - escape-sequence
        // `\\d` - любая цифра, мета-символ, на месте которого может быть любая цифра
        // `\\s` - пробел
        // `.` - любой символ
        // Квантифаеры (quantitifers) - отвечают за количество чего-то перед ними
        // `+` - один или больше того, что до него (в данном случае цифр). Т.е. `\\d+` - любое число
        // `?` - 0 или 1 того, что до него (опциональность чего-либо)
        // `*` - 0 или больше того, что до него. Не ограничено максимумом в 1, как предыдущий квантифаер
        // Другое
        // `( )` - RegEx скобочная группа. Благодаря нему квантифаер применяется ко всему содержимому внутри
        // Также скобочную группу можно получить через group(номер группы)
        // Группа 0 это вся найденная строка, 1 (в данном случае) - число, 2 - единица валюты
        // `|` внутри скобочной группы - знак ИЛИ. Либо первое, либо второе
        // `?:` в начале скобочной группы делает её non-capturing. Она не захватывает содержимое
        // Нужно, чтобы matcher.group(...) не считал её за группу

        Pattern pat = Pattern.compile("(\\d+(?:\\.\\d+)?) (USD|RUB|EU)");

        Matcher matcher = pat.matcher(text);

        while (matcher.find()) {
            System.out.println("> " + matcher.group(1) + " [" + matcher.group(2) + "]");
        }
    }

    private static void checkNumbers() {
        String correct = "(1 + 8) – 9 / 4.";
        String incorrect = "6 / 5 – 2 * 9";

        // 1 или больше чисел, 0 или больше пробелов, знак +
        Pattern pat = Pattern.compile("\\d+\\s*+");

        if(pat.matcher(correct).find()) {
            System.out.println("Found num in correct!");
        }

        if(!pat.matcher(incorrect).find()) {
            System.out.println("Not num found in incorrect!");
        }
    }

    private static void checkDate() {
        String correct = "29/02/2000";
        String incorrect = "1/1/1899";

        // Группа с числами 10-29 или 30 или 31 / группа с числами 0-9 или 10-12 / группа с числами 1900-18999 или 2000-9999
        Pattern pat = Pattern.compile("([1-2]?[0-9]|30|31)/([0-9]|1[0-2])/(19[0-9][0-9]|[2-9][0-9][0-9][0-9])");

        if(pat.matcher(correct).find()) {
            System.out.println("Found date in correct!");
        }

        if(!pat.matcher(incorrect).find()) {
            System.out.println("Not found date in incorrect!");
        }
    }

    private static void checkEmail() {
        String correct = "user@example.com";
        String incorrect = "myhost@@@com.ru";

        // https://regexr.com/2rhq7
        Pattern pat = Pattern.compile("[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?");

        if(pat.matcher(correct).find()) {
            System.out.println("Found email in correct!");
        }

        if(!pat.matcher(incorrect).find()) {
            System.out.println("Not found email in incorrect!");
        }
    }

    private static void checkPass() {
        String correct = "F032_Password";
        String incorrect = "smart_pass";

        // https://stackoverflow.com/questions/19605150/regex-for-password-must-contain-at-least-eight-characters-at-least-one-number-a
        // Модифицированный шаблон отсюда
        // `?=` - lookahead. Трудно объяснить, в интернете лучше посмотреть :I
        // `{8,}` - от 8 и более символов, квантифаер
        // `.*` - любой символ любое количество раз (0-inf)
        Pattern pat = Pattern.compile("(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[A-Za-z\\d_]{8,}");

        if(pat.matcher(correct).find()) {
            System.out.println("Found pass in correct!");
        }

        if(!pat.matcher(incorrect).find()) {
            System.out.println("Not found pass in incorrect!");
        }
    }
}