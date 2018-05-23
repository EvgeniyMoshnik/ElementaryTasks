package elementarytasks.sequence;

import java.util.ArrayList;
import java.util.List;

public class Sequence {
    private int limit;
    private List<Integer> listSequence = new ArrayList<>();

    public Sequence(int limit) {
        this.limit = limit;
    }

    List<Integer> getSequence() {
        for (int i = 1; Math.pow(i, 2) < limit; i++) {
            listSequence.add(i);
        }
        return listSequence;
    }

    void printSequence(List<Integer> listSequence) {
        for (Integer num : listSequence) {
            System.out.print(num + ", ");
        }
    }
}
