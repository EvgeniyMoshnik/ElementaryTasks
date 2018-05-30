package elementarytasks.fileparser;

import elementarytasks.Constants;
import elementarytasks.Parameter;
import elementarytasks.Validator;

import java.util.List;
import java.util.Scanner;

public class FileParserExecutor {

    private static String help = " \nApplication File parser. \n" +
            "If 2 params application will calculate amount of substring entries. \n" +
            "If 3 params application will replace with other substring.\n";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String params = Parameter.enterParameters(scanner, Constants.MESSAGE_ENTER_PARSER);
            List<String> paramsList = Parameter.parseParams(params);
            if (!Validator.isParams(paramsList, help, 1)) {
                continue;
            }
            String path = paramsList.get(0);
            String strCount = paramsList.get(1);
            FileParser fileParser = new FileParser();
            StringBuffer sb = fileParser.fileReade(path);

            if (paramsList.size() == 2) {
                int quantity;
                quantity = fileParser.countString(sb, strCount);
                System.out.println("Quantity " + "\"" + strCount + "\": " + quantity);
            } else {
                String strReplace = paramsList.get(2);
                fileParser.searchReplace(sb, strCount, strReplace);
                fileParser.writeReplaced(sb, path);
                System.out.println("String " + strCount + " replaced on " + strReplace + ".");
            }
            System.out.println(Constants.MESSAGE_APP_CONTINUE);
            String appContinue = scanner.nextLine();
            if (Validator.isContinue(appContinue)) {
                continue;
            }
            break;
        }
    }
}
