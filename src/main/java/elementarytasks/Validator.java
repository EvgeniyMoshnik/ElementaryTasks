package elementarytasks;


import java.util.List;

public interface Validator {

    static boolean isSize(int width, int height) {
        return  (width >= 0 && height >= 0);
    }

    static boolean isRange(int start, int end) {
        if ((start > 0 && end > 0) && (start <= end)) {
            return true;
        } else {
            System.out.println("Incorrect range!");
        }
        return false;
    }

    static boolean isNumberDouble(String number) {
        try {
             Double.parseDouble(number);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    static boolean isNumberInteger(String number) {
        try {
            Integer.parseInt(number);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    static boolean isContinue(String appContinue) {
        return  (appContinue.equalsIgnoreCase("y") ||
                appContinue.equalsIgnoreCase("yes"));

    }

    static boolean isTriangle(double sideOne, double sideTwo, double sideThree) {
        boolean isTriangle = false;
        if ((sideOne + sideTwo > sideThree) && (sideOne + sideThree > sideTwo && sideTwo + sideThree > sideOne)) {
            isTriangle = true;
        } else {
            System.out.println("This triangle does not exist!");
        }
        return isTriangle;
    }

    static boolean isParamsForTriangle(List<String> params) {
        if (params.size() < 4) {
            return false;
        }
        return  (isNumberDouble(params.get(1)) &&
                isNumberDouble(params.get(2)) &&
                isNumberDouble(params.get(3)));
    }

    static boolean isParams(List<String> params, String help, int notCountParams) {
        if (params.size() <= notCountParams) {
            System.out.println(help);
            return false;
        }
        return true;
    }

}
