package elementarytasks.triangles;


import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.StringTokenizer;

public class TriangleList {
   private String name;
   private double sideOne;
   private double sideTwo;
   private double sideThree;

    private ArrayList<Triangle> triangles = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in).useLocale(Locale.US);



    Triangle createTriangle(Scanner scanner) {
        String strScan;
        String[] params = new String[4];
        String delimiters = ",";
        boolean paramsValid;

        do {
            System.out.print("Enter name and three sides of triangle:\t");
            paramsValid = false;
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

        //    for (String param : params) {
          //      System.out.println(param);
        //    }
        } while (!isTriangle(sideOne, sideTwo, sideThree) && paramsValid);

        return new Triangle(name, sideOne, sideTwo, sideThree);

    }

    private boolean isTriangle(double sideOne, double sideTwo, double sideThree) {
        boolean isTriangle = false;

        if ((sideOne + sideTwo > sideThree) && (sideOne + sideThree > sideTwo && sideTwo + sideThree > sideOne)) {
         //   System.out.println("This triangle exists");
            isTriangle = true;
        } else {
            System.out.println("This triangle does not exist!");
        }
        return isTriangle;
    }

    void sortTriangles() {
     triangles.sort(Triangle.AreaComparator);
    }

    void putTriangle(Triangle triangle) {
        triangles.add(triangle);
    }

    void printTriangles() {
        System.out.println("========= Triangles list: =========");
        for(Triangle triangle: triangles) {
            System.out.println(triangle.toString());
        }
    }

   // public ArrayList<Triangle> getTriangles() {
  //      return triangles;
//    }

}
