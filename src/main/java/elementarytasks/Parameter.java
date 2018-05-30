package elementarytasks;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public interface Parameter {

    static String enterParameters(Scanner scanner, String message) {
        String params;
        System.out.print(message);
        params = scanner.nextLine();
        return params;
    }

    static ArrayList<String> parseParams(String params) {
        ArrayList<String> arrayParams = new ArrayList<>();
        String delimiters = ",";
        StringTokenizer st = new StringTokenizer(params, delimiters, false);
        while (st.hasMoreTokens()) {
            arrayParams.add(st.nextToken());
        }
        return arrayParams;
    }

    static int[] toIntArraySizeBoard(String[] args) throws NumberFormatException {
        int[] arrayArgs = new int[2];
        for (int i = 0; i < args.length; i++) {
            arrayArgs[i] = Integer.parseInt(args[i]);
        }
        return arrayArgs;
    }

    static double toDoubleParameter(Scanner scanner, String help) {
        double result;
        scanner.useDelimiter("\n");
        while (!scanner.hasNextDouble()) {
            if (scanner.hasNext("")) {
                System.out.println(help + "\n" +
                        "Please enter again parameter.");
            } else {
                System.out.println("Parameter should be number! \n" +
                        "Please enter again parameter.");
            }
            scanner.next();
        }
        result = scanner.nextDouble();
        return result;
    }

    static int toIntParameter(Scanner scanner, String help) {
        int result;
        scanner.useDelimiter("\n");
        while (!scanner.hasNextInt()) {
            if (scanner.hasNext("")) {
                System.out.println(help + "\n" +
                        "Please enter again parameter.");
            } else {
                System.out.println("Parameter should be integer! \n" +
                        "Please enter again parameter.");
            }
            scanner.next();
        }
        result = scanner.nextInt();
        return result;
    }

}
