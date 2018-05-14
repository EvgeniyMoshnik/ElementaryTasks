package elementarytasks;

public class Validator {

    public int[] toIntArray(String[] args) throws NumberFormatException {
        int[] arrayArgs = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            arrayArgs[i] = Integer.parseInt(args[i]);
        }
        return arrayArgs;
    }

  //  public double scanner
}
