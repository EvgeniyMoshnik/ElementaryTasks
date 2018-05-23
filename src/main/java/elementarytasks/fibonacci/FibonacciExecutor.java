package elementarytasks.fibonacci;

import java.util.List;

public class FibonacciExecutor {

    static String help = "Number Fibonacci";

    public static void main(String[] args) {
        int start = Integer.parseInt(args[0]);
        int end = Integer.parseInt(args[1]);
        Fibonacci fibonacci = new Fibonacci(start, end);

        List<Integer> listFibonacci = fibonacci.getFibonacciNumb();
        fibonacci.printListFibonacci(listFibonacci);
    }
}
