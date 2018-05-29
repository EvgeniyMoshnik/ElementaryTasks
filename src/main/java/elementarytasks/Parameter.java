package elementarytasks;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public interface Parameter {

    static String enterParameters(Scanner scanner, String message) {
        String params;
        System.out.print(message);
        params = scanner.nextLine();
        return params;
    }

    static ArrayList<String> parseParams(String params) {
        ArrayList<String> arrayParams = new ArrayList<>();
        String delimiters = ",";
        StringTokenizer st = new StringTokenizer(params, delimiters, false);
        while (st.hasMoreTokens()) {
            arrayParams.add(st.nextToken());
        }
        return arrayParams;
    }

}
