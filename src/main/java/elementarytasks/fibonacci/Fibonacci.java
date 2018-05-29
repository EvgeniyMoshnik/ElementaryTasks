package elementarytasks.fibonacci;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

    private int start;
    private int end;
    private List<Integer> listFibonacci = new ArrayList<>();

    public Fibonacci(int start, int end) {
        this.start = start;
        this.end = end;
    }

   public List<Integer> getFibonacciNumb() {
        int nOne = 1;
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

    void printListFibonacci(List<Integer> listFibonacci) {
        System.out.print("UpToTwenty Fibonacci: ");
        for (Integer num: listFibonacci) {
            System.out.print(num + ", ");
        }
    }

}
