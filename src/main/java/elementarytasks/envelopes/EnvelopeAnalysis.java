package elementarytasks.envelopes;

import elementarytasks.Constants;
import elementarytasks.Validator;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class EnvelopeAnalysis {
    private static String help = "This application check the possibility to enclose one envelope in another.\n" +
            "You may use a floating-point format.";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        EnvelopeList envelopeList = new EnvelopeList();
        String result;
        String appContinue;
        while (true) {
            envelopeList.createEnvelopes(scanner, help);
            result = envelopeList.compareEnvelopes();
            System.out.println(result);
            System.out.println(Constants.MESSAGE_APP_CONTINUE);
            appContinue = scanner.nextLine();
            if (Validator.isContinue(appContinue)) {
                continue;
            }
            break;
        }
    }




}
