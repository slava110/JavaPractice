package ru.mirea.prac_12;

import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    private static void task1() {
        Person prsn = new Person("Alex", "Black", "Igorevich");
        System.out.println(prsn.getFullName());
        Person prsn2 = new Person("John", "White", "");
        System.out.println(prsn2.getFullName());
        Person prsn3 = new Person("John", "", "");
        System.out.println(prsn3.getFullName());
    }

    private static void task2() {
        Address add1 = Address.fromStringSplit("Russia, Moscow, Moscow, Volkovskaya, 71, 8, 894");
        System.out.println(add1);
        Address add2 = Address.fromStringTokenize("Russia, Moscow, Moscow, Volkovskaya, 71, 8, 894");
        System.out.println(add2);
    }

    private static void task3() {
        String[] shirts = new String[11];
        shirts[0] = "S001,Black Polo Shirt,Black,XL";
        shirts[1] = "S002,Black Polo Shirt,Black,L";
        shirts[2] = "S003,Blue Polo Shirt,Blue,XL";
        shirts[3] = "S004,Blue Polo Shirt,Blue,M";
        shirts[4] = "S005,Tan Polo Shirt,Tan,XL";
        shirts[5] = "S006,Black T-Shirt,Black,XL";
        shirts[6] = "S007,White TShirt, White,XL";
        shirts[7] = "S008,White T-Shirt,White,L";
        shirts[8] = "S009,Green T-Shirt,Green,S";
        shirts[9] = "S010,Orange T-Shirt,Orange,S";
        shirts[10] = "S011,Maroon Polo Shirt,Maroon,S";

        Shirt[] converted = Shirt.convert(shirts);

        for (Shirt shirt : converted) {
            System.out.println("> " + shirt.toString());
        }
    }

    private static void task4() {
        String firstNumber = "+79175655655";
        System.out.println("[Phone][1]: " + convertPhoneNumber(firstNumber));

        String secNumber = "+104289652211";
        System.out.println("[Phone][2]: " + convertPhoneNumber(secNumber));

        String thirdNumber = "89175655655";
        System.out.println("[Phone][3]: " + convertPhoneNumber(thirdNumber));
    }

    private static String convertPhoneNumber(String raw) {
        Pattern pat = Pattern.compile("(\\+\\d+|8)(\\d{3})(\\d{3})(\\d{4})");
        Matcher mt = pat.matcher(raw);

        if(mt.matches()) {
            String cc = mt.group(1);

            StringBuilder sb = new StringBuilder("+");

            if(cc.equals("8")) {
                sb.append("7");
            } else if(cc.startsWith("+")) {
                sb.append(cc.substring(1));
            } else {
                throw new IllegalArgumentException("Illegal phone number format: " + raw);
            }

            sb.append(mt.group(2));
            sb.append("-");
            sb.append(mt.group(3));
            sb.append("-");
            sb.append(mt.group(4));

            return sb.toString();
        }
        throw new IllegalArgumentException("Illegal phone number format: " + raw);
    }

    static class Person {
        private final String firstName;
        private final String lastName;
        private final String patronymic;

        public Person(String firstName, String lastName, String patronymic) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.patronymic = patronymic;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public String getPatronymic() {
            return patronymic;
        }

        public String getFullName() {
            StringBuilder sb = new StringBuilder();
            if(!firstName.isEmpty())
                sb.append(firstName).append(' ');
            if(!lastName.isEmpty())
                sb.append(lastName).append(' ');
            sb.append(patronymic);
            return sb.toString();
        }
    }

    static class Address {
        private final String country;
        private final String region;
        private final String city;
        private final String street;
        private final String house;
        private final String building;
        private final String flat;

        public Address(String country, String region, String city, String street, String house, String building, String flat) {
            this.country = country;
            this.region = region;
            this.city = city;
            this.street = street;
            this.house = house;
            this.building = building;
            this.flat = flat;
        }

        @Override
        public String toString() {
            return "Address{" +
                    "country='" + country + '\'' +
                    ", region='" + region + '\'' +
                    ", city='" + city + '\'' +
                    ", street='" + street + '\'' +
                    ", house='" + house + '\'' +
                    ", building='" + building + '\'' +
                    ", flat='" + flat + '\'' +
                    '}';
        }

        public static Address fromStringSplit(String raw) {
            String[] parts = raw.split(",");

            if(parts.length != 7)
                return null;

            return new Address(
                    parts[0].trim(),
                    parts[1].trim(),
                    parts[2].trim(),
                    parts[3].trim(),
                    parts[4].trim(),
                    parts[5].trim(),
                    parts[6].trim()
            );
        }

        public static Address fromStringTokenize(String raw) {
            StringTokenizer tkzr = new StringTokenizer(raw, ",.;");

            if(tkzr.countTokens() != 7)
                return null;

            return new Address(
                    tkzr.nextToken().trim(),
                    tkzr.nextToken().trim(),
                    tkzr.nextToken().trim(),
                    tkzr.nextToken().trim(),
                    tkzr.nextToken().trim(),
                    tkzr.nextToken().trim(),
                    tkzr.nextToken().trim()
            );
        }
    }

    static class Shirt {
        private final String serial;
        private final String name;
        private final String color;
        private final String size;

        Shirt(String serial, String name, String color, String size) {
            this.serial = serial;
            this.name = name;
            this.color = color;
            this.size = size;
        }

        @Override
        public String toString() {
            return "Shirt{" +
                    "serial='" + serial + '\'' +
                    ", name='" + name + '\'' +
                    ", color='" + color + '\'' +
                    ", size='" + size + '\'' +
                    '}';
        }

        public static Shirt[] convert(String[] raw) {
            Shirt[] res = new Shirt[raw.length];

            for (int i = 0; i < raw.length; i++) {
                String[] parts = raw[i].split(",");

                if(parts.length != 4) {
                    throw new IllegalArgumentException("Not enough parts in shirt element " + raw[i]);
                }

                res[i] = new Shirt(
                    parts[0],
                        parts[1],
                        parts[2],
                        parts[3]
                );
            }

            return res;
        }
    }
}
