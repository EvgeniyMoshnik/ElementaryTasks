package elementarytasks.triangles;

import elementarytasks.Validator;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.StringTokenizer;

public class TriangleExecutor {
    static String help = "This application return sorted triangles.";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        TriangleList triangleList = new TriangleList();
        Triangle triangle;
        String params;
        ArrayList<String> arrayParams;
        String appContinue;

        while (true) {
            params = triangleList.enterParameters(scanner);
            params = triangleList.transformParameters(params);
            arrayParams = triangleList.parseParams(params);
            if (!Validator.isParamsForTriangle(arrayParams)) {
                System.out.println("Incorrect parameters!");
                continue;
            }
            triangle = triangleList.createTriangle(arrayParams);
            if (triangle != null) {
                triangleList.putTriangle(triangle);
            }
            System.out.println("If you want to continue please enter \"y\" or \"yes\".");
            appContinue = scanner.nextLine();
            if (Validator.isContinue(appContinue)) {
                continue;
            }
            triangleList.printSortedTriangles();
            break;
        }
    }
}