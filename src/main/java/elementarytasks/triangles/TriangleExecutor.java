package elementarytasks.triangles;

import elementarytasks.Validator;

import java.util.Locale;
import java.util.Scanner;
import java.util.StringTokenizer;

public class TriangleExecutor {
    String help = "This application return sorted triangles.";
    Validator valid = new Validator();

    public static void main(String[] args) {
        TriangleExecutor triangleExecutor = new TriangleExecutor();
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        triangleExecutor.createTriangle(scanner);
    }

    void createTriangle(Scanner scanner) {
        String name;
        double sideOne;
        double sideTwo;
        double sideThree;
        String scan;
        String[] params = new String[4];
        String delimiters = ",";
        System.out.print("Enter name and three sides of triangle:\t");
        scan = scanner.nextLine();
        scan = scan.replaceAll("[\\s]", "");

        StringTokenizer st = new StringTokenizer(scan, delimiters, false);

        for(int i = 0; i < 4; i++) {
            params[i] = st.nextToken().toLowerCase();
        }


      //  params = scan.split(",");

       for (String param: params) {
            System.out.println(param);
       }



    }
}