package elementarytasks.sequence;

import java.util.List;

public class SequenceExecutor {

    public static void main(String[] args) {
        int limit = Integer.parseInt(args[0]);
        Sequence sequence = new Sequence(limit);
        List<Integer> listSequence = sequence.getSequence();
        sequence.printSequence(listSequence);
    }


}
