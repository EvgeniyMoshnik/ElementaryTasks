package elementarytasks.triangles;

import java.util.Comparator;

public class Triangle {
    private String name;
    private double sideOne;
    private double sideTwo;
    private double sideThree;
    private double area;

    public Triangle(String name, double sideOne, double sideTwo, double sideThree) {
        this.name = name;
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.sideThree = sideThree;
    }

    public double getArea() {
        if (area == 0.0d) {
            area = calculateArea();
        }
        return area;
    }

    private double calculateArea() {
        double halfPerimeter;
        double area;
        halfPerimeter = (sideOne + sideTwo + sideThree) / 2;
        area = Math.sqrt(halfPerimeter * (halfPerimeter - sideOne) * (halfPerimeter - sideTwo) *
                (halfPerimeter - sideThree));
        return area;
    }

    @Override
    public String toString() {
        return "[Triangle " + name + "]: " + area + " cm";
    }



    public static Comparator<Triangle> AreaComparator = (t1, t2) -> {
        Double areaOne = t1.getArea();
        Double areaTwo = t2.getArea();
        return areaOne.compareTo(areaTwo);
    };

}

