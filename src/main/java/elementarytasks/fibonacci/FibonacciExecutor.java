package elementarytasks.fibonacci;

import elementarytasks.Constants;
import elementarytasks.Parameter;
import elementarytasks.Validator;

import java.util.List;
import java.util.Scanner;

public class FibonacciExecutor {

    static String help = "Application number Fibonacci. You must enter two positive integer values.";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int start;
        int end;
        String appContinue;

        while (true) {
            System.out.print("Enter start range:\t");
            start = Parameter.toIntParameter(scanner, help);
            System.out.print("Enter end range:\t");
            end = Parameter.toIntParameter(scanner, help);
            scanner.nextLine();
            if (!Validator.isRange(start, end)) {
                continue;
            }
            Fibonacci fibonacci = new Fibonacci(start, end);
            List<Integer> listFibonacci = fibonacci.getFibonacciNumb();
            fibonacci.printListFibonacci(listFibonacci, start, end);

            System.out.println(Constants.MESSAGE_APP_CONTINUE);
            appContinue = scanner.nextLine();
            if (Validator.isContinue(appContinue)) {
                continue;
            }
            break;
        }
    }
}
