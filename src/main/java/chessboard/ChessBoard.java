package chessboard;

public class ChessBoard {

    private final String star = "*";
    private final String space = " ";
    private int height;
    private int width;


    public ChessBoard(int height, int width) {
        this.height = height;
        this.width = width;

    }

    public static void main(String[] args) {
        System.out.println("Hello " + args[0]);
    }
}
