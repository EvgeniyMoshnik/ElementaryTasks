package elementarytasks.fibonacci;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Fibonacci {

    private int start;
    private int end;
    private List<Integer> listFibonacci = new ArrayList<>();

    public Fibonacci(int start, int end) {
        this.start = start;
        this.end = end;
    }

   public List<Integer> getFibonacciNumb() {
        int nOne = 0;
        int nTwo = 1;
        int sum;
        while (true) {
            if (nTwo >= start) {
                listFibonacci.add(nTwo);
            }
                sum = nOne + nTwo;
                nOne = nTwo;
                nTwo = sum;
                if (nTwo >= end + 1) {
                    return listFibonacci;
                }
        }
    }

    void printListFibonacci(List<Integer> listFibonacci, int start, int end) {
        System.out.print("In range " + start + " - " + end + " fibonacci numbers: ");
        String result = listFibonacci.stream().map(String::valueOf).collect(Collectors.joining(", "));
        System.out.println(result + ".");
    }

}
