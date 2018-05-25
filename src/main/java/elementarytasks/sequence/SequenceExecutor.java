package elementarytasks.sequence;

import elementarytasks.Validator;

import java.util.List;

public class SequenceExecutor {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Incorrect data!");
            return;
        }
        if (!Validator.isNumberInteger(args[0])){
            System.out.println("Parameter should be number!");
            return;
        }
        int limit = Integer.parseInt(args[0]);
        Sequence sequence = new Sequence(limit);
        List<Integer> listSequence = sequence.getSequence();
        sequence.printSequence(listSequence);
    }


}
