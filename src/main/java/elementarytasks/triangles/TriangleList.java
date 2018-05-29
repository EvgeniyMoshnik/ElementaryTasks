package elementarytasks.triangles;


import elementarytasks.Validator;

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

    ArrayList<String> parseParams(String params) {
        ArrayList<String> arrayParams = new ArrayList<>();
        String delimiters = ",";
        StringTokenizer st = new StringTokenizer(params, delimiters, false);
        for (int i = 0; i < 4 && st.hasMoreTokens(); i++) {
            arrayParams.add(st.nextToken());
        }
        return arrayParams;
    }

    String enterParameters(Scanner scanner) {
        String params;
        System.out.print("Enter name and three sides of triangle:\t");
        params = scanner.nextLine();
        return params;
    }

    String transformParameters(String params) {
        String result;
        result = params.replaceAll("[\\s]", "").toLowerCase();
        return result;
    }

    Triangle createTriangle(ArrayList<String> params) {
        name = params.get(0);
        sideOne = Double.parseDouble(params.get(1));
        sideTwo = Double.parseDouble(params.get(2));
        sideThree = Double.parseDouble(params.get(3));
        if (!Validator.isTriangle(sideOne, sideTwo, sideThree)) {
            return null;
        }
        return new Triangle(name, sideOne, sideTwo, sideThree);
    }

    void sortTriangles() {
        triangles.sort(Triangle.AreaComparator);
    }

    void putTriangle(Triangle triangle) {
        triangles.add(triangle);
    }

    void printSortedTriangles() {
        sortTriangles();
        System.out.println("========= Triangles list: =========");
        for(Triangle triangle: triangles) {
            System.out.println(triangle.toString());
        }
    }

   // public ArrayList<Triangle> getTriangles() {
  //      return triangles;
//    }

}
