package elementarytasks.triangles;

import elementarytasks.Validator;

import java.util.Locale;
import java.util.Scanner;
import java.util.StringTokenizer;

public class TriangleExecutor {
    static String help = "This application return sorted triangles.";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        TriangleList triangleList = new TriangleList();
        Triangle triangle;
        String appContinue;

        while (true) {
           triangle =  triangleList.createTriangle(scanner);
            if (triangle != null) {
                triangleList.putTriangle(triangle);
            }
            System.out.println("If you want to continue please enter \"y\" or \"yes\".");
            appContinue = scanner.nextLine();
            if (appContinue.equalsIgnoreCase("y") || appContinue.equalsIgnoreCase("yes")) {
                continue;
            }
            triangleList.sortTriangles();
            triangleList.printTriangles();
            break;
        }
    }


}