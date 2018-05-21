package elementarytasks.fibonacci;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

    List<Integer> listFibon = new ArrayList<>();

    List<Integer> getFibonacciNumb(int start, int end) {
        int nOne = 1;
        int nTwo = 1;
        int sum;
        while (true) {
            if (nTwo >= start) {
                listFibon.add(nTwo);
                sum = nOne + nTwo;
                nOne = nTwo;
                nTwo = sum;
                if (nTwo >= end) {
                    return listFibon;
                }
            }
        }
    }


}
