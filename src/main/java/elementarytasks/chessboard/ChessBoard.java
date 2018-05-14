package elementarytasks.chessboard;

public class ChessBoard {

    private final String star_space = "* ";
    private final String space_star = " *";
    private int height;
    private int width;


    public ChessBoard(int height, int width) {
        this.height = height;
        this.width = width;

    }

    void drawBoard() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if ((i % 2) == 0) {
                    System.out.print(star_space);
                } else {
                    System.out.print(space_star);
                }
            }
            System.out.println();
        }
    }

}
