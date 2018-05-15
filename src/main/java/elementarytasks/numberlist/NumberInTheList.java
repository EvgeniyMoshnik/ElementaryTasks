package elementarytasks.numberlist;

public class NumberInTheList {
    static String help = "Application writes inserted digit by text.";
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println(help);
            return; }

        String number;

        number = args[0];

        if (number.length() == 1) {

        }
    }


    String fromOnetoNine(String num) {
       // String result;
        if (num.equals("1")) {
            return "один";
        }
        if (num.equals("2")) {
            return "два";
        }
        if (num.equals("3")) {
            return "три";
        }
        if (num.equals("4")) {
            return "четыре";
        }
        if (num.equals("5")) {
            return "пять";
        }
        if (num.equals("6")) {
            return "шесть";
        }
        if (num.equals("7")) {
            return "семь";
        }
        if (num.equals("8")) {
            return "восемь";
        }
        if (num.equals("9")) {
            return "девять";
        }

        return null;
    }
}
