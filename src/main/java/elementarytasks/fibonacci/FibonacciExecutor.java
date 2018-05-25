package elementarytasks.fibonacci;

import elementarytasks.Validator;

import java.util.List;

public class FibonacciExecutor {

    static String help = "Number Fibonacci";

    public static void main(String[] args) {

        if (args.length < 2) {
            System.out.println(help);
            System.out.println("Incorrect data!");
            return;
        }

        if (!Validator.isNumberInteger(args[0]) || !Validator.isNumberInteger(args[1])) {
            System.out.println("Parameter should be number!");
            return;
        }
        int start = Integer.parseInt(args[0]);
        int end = Integer.parseInt(args[1]);
        Fibonacci fibonacci = new Fibonacci(start, end);

        List<Integer> listFibonacci = fibonacci.getFibonacciNumb();
        fibonacci.printListFibonacci(listFibonacci);
    }
}
