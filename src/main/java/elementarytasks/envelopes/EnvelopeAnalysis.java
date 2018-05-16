package elementarytasks.envelopes;

import elementarytasks.Validator;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class EnvelopeAnalysis {
    private static String help = "This application check the possibility to enclose one envelope in another.\n" +
            "You may use a floating-point format.";

    private ArrayList<Envelope> listEnvelope;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        EnvelopeAnalysis analysis = new EnvelopeAnalysis();
        String appContinue;
        while (true) {
            analysis.createEnvelopes(scanner, 2);
            analysis.compareEnvelopes(1, 2);
            System.out.println("If you want to continue please enter \"y\" or \"yes\".");
            appContinue = scanner.nextLine();
            if (appContinue.equalsIgnoreCase("y") || appContinue.equalsIgnoreCase("yes")) {
                continue;
            }
            break;
        }
    }

     ArrayList<Envelope> createEnvelopes(Scanner scanner, int envelopesNumber) {
        double width;
        double height;
        Envelope envelope;
        Validator validator = new Validator();
        listEnvelope = new ArrayList<>();
        int numEnvel = 1;
        do {
            System.out.print("Enter width envelope № " + numEnvel + ":\t");
            width = validator.doubleScan(scanner, help);
            System.out.print("Enter height envelope № " + numEnvel + ":\t");
            height = validator.doubleScan(scanner, help);
            scanner.nextLine();
            envelope = new Envelope(width, height);
            listEnvelope.add(envelope);
            numEnvel++;
            envelopesNumber--;
        } while (envelopesNumber != 0);
        return listEnvelope;
    }

    void compareEnvelopes(int envelopeOne, int envelopeTwo) {
        Envelope first = listEnvelope.get(envelopeOne - 1);
        Envelope second = listEnvelope.get(envelopeTwo - 1);
        double firstWidth = first.getWidth();
        double firstHeight = first.getHeight();
        double secondWidth = second.getWidth();
        double secondHeight = second.getHeight();

        if ((firstWidth > secondWidth) && (firstHeight > secondHeight) ||
                ((firstWidth > secondHeight) && (firstHeight > secondWidth))) {
            System.out.println("First envelope can contain second.");
        } else if ((firstWidth < secondWidth) && (firstHeight < secondHeight) ||
                ((firstWidth < secondHeight) && (firstHeight < secondWidth))) {
            System.out.println("Second envelope can contain first.");
        } else {
            System.out.println("Envelopes can't contain one other.");
        }
    }
}
