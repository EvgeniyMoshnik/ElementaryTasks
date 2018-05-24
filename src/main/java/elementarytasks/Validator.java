package elementarytasks;

import java.util.Scanner;

public interface Validator {

    static int[] toIntArray(String[] args) throws NumberFormatException {
        int[] arrayArgs = new int[2];
        for (int i = 0; i < args.length; i++) {
            arrayArgs[i] = Integer.parseInt(args[i]);
        }
        return arrayArgs;
    }

    static boolean isSize(int width, int height) {
        //  boolean result = false;
        if (width <= 0 || height <= 0) {
            return false;
        }
        return true;

    }

    static double doubleScan(Scanner scanner, String help) {
        double result;
        scanner.useDelimiter("\n");
        while (!scanner.hasNextDouble()) {
            if (scanner.hasNext("")) {
                System.out.println(help);
            } else {
                System.out.println("Parameter should be number!");
            }
            scanner.next();
        }
        result = scanner.nextDouble();
        return result;
    }

 //   static double parseDoable(String number, String help) {

  //  }

    static boolean isNumber(String number) {
        try {
            double num = Double.parseDouble(number);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
}
