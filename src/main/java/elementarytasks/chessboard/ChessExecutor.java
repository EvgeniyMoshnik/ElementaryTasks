package elementarytasks.chessboard;


import elementarytasks.Validator;

public class ChessExecutor {

    private static Validator validator;

    private static void printHelp() {
        System.out.println("This application draws chess board of given:\n" +
                "height = first integer argument of application,\n" +
                "width = second integer argument of application.\n" +
                "Default height and width equal 1.");
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            printHelp();
            return;
        }
        int height = 1;
        int width = 1;
        int[] arrayIntArgs;

        if (args.length >= 2) {
            validator = new Validator();
            try {
                arrayIntArgs = validator.toIntArray(args);
                height = arrayIntArgs[0];
                width = arrayIntArgs[1];
            } catch (NumberFormatException exc) {
                System.out.println("Invalid arguments. Should be integers!");
            }
        }

        ChessBoard chessBoard = new ChessBoard(height, width);
        if (height == 1 && width == 1) {
            System.out.println("Default chess board 1*1:");
        } else {
            System.out.println("Chess board " + height + "*" + width + ":");
        }
        chessBoard.drawBoard();
    }
}