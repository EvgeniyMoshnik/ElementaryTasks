package elementarytasks.chessboard;


import elementarytasks.Validator;

public class ChessExecutor {

    private static String help = "This application draws chess board of given:\n" +
            "height = first integer argument of application,\n" +
            "width = second integer argument of application.";

    public static void main(String[] args) {
        if (args.length <= 1) {
            System.out.println(help);
            return;
        }
        int height;
        int width;
        int[] arrayIntArgs = new int[args.length];

        try {
            arrayIntArgs = Validator.toIntArray(args);
        } catch (NumberFormatException exc) {
            System.out.println("Invalid arguments. Should be integers!");
        }
        height = arrayIntArgs[0];
        width = arrayIntArgs[1];

        if (!Validator.isSize(width, height)) {
            System.out.println("Only positive numbers!");
            return;
        }
        ChessBoard chessBoard = new ChessBoard(height, width);
        System.out.println("Chess board " + height + "*" + width + ":");
        chessBoard.drawBoard();
    }
}