package elementarytasks.triangles;

import elementarytasks.Validator;

import java.util.Locale;
import java.util.Scanner;
import java.util.StringTokenizer;

public class TriangleExecutor {
    String help = "This application return sorted triangles.";

    public static void main(String[] args) {
      //  TriangleExecutor triangleExecutor = new TriangleExecutor();
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        TriangleList triangleList = new TriangleList();
        triangleList.createTriangle(scanner);
        triangleList.printTtiangles();

        while(true)

    }


}