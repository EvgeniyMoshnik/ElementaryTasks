package elementarytasks;

import java.util.Scanner;

public class Validator {

    public int[] toIntArray(String[] args) throws NumberFormatException {
        int[] arrayArgs = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            arrayArgs[i] = Integer.parseInt(args[i]);
        }
        return arrayArgs;
    }

    public double doubleScan(Scanner scanner, String help)  {
        double result;
        scanner.useDelimiter("\n");
        while(!scanner.hasNextDouble()) {
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
}
