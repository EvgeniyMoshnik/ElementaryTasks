package elementarytasks.triangles;


import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class TriangleList {

    ArrayList<Triangle> triangles = new ArrayList<>();




    void createTriangle(Scanner scanner) {
        String name;
        double sideOne;
        double sideTwo;
        double sideThree;
        String strScan;
        String[] params = new String[4];
        String delimiters = ",";

        do {
            System.out.print("Enter name and three sides of triangle:\t");
            strScan = scanner.nextLine();
            strScan = strScan.replaceAll("[\\s]", "");

            StringTokenizer st = new StringTokenizer(strScan, delimiters, false);

            for (int i = 0; i < 4; i++) {
                params[i] = st.nextToken();
            }
            name = params[0].toLowerCase();
            sideOne = Double.parseDouble(params[1]);
            sideTwo = Double.parseDouble(params[2]);
            sideThree = Double.parseDouble(params[3]);


            for (String param : params) {
                System.out.println(param);
            }
        } while (!isTriangleExists(sideOne, sideTwo, sideThree));

        triangles.add(new Triangle(name, sideOne,sideTwo, sideThree));

    }

    private boolean isTriangleExists(double sideOne, double sideTwo, double sideThree) {
        boolean isTriangle = false;

        if ((sideOne + sideTwo > sideThree) && (sideOne + sideThree > sideTwo && sideTwo + sideThree > sideOne)) {
         //   System.out.println("This triangle exists");
            isTriangle = true;
        } else {
            System.out.println("This triangle does not exist!");
        }
        return isTriangle;
    }

    void sort () {
  //      triangles.sort();
    }
}
