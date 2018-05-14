package elementarytasks.envelopes;

import java.util.ArrayList;
import java.util.Scanner;

public class EnvelopeAnalysis {

    ArrayList<Envelope> listEnvelope;

    ArrayList<Envelope> createEnvelopes(Scanner scanner, int envelopesNumber) {
        double width;
        double height;
        Envelope envelope;
        listEnvelope = new ArrayList<Envelope>();
        int i = 1;
        do {
            System.out.print("Enter width envelope № " + i + ":\t");
            width = scanner.nextDouble();
            System.out.print("Enter height envelope № " + i + ":\t");
            height = scanner.nextDouble();
            envelope = new Envelope(width, height);
            listEnvelope.add(envelope);
            ++i;
            envelopesNumber--;
        } while (envelopesNumber != 0);
        return listEnvelope;
    }

    void compareEnvelopes(int envelNumbOne, int envelNumTwo) {
        Envelope envelopeOne = listEnvelope.get(envelNumbOne - 1);
        Envelope envelopeTwo = listEnvelope.get(envelNumTwo - 1);

        if ((envelopeOne.getHeight() > envelopeTwo.getHeight()) && (envelopeOne.getWidth() > envelopeTwo.getWidth()) ||
                ((envelopeOne.getHeight() > envelopeTwo.getWidth()) && (envelopeOne.getWidth() > envelopeTwo.getHeight()))) {

            System.out.println("First envelope can contain second.");

        } else if ((envelopeOne.getHeight() < envelopeTwo.getHeight()) && (envelopeOne.getWidth() < envelopeTwo.getWidth()) ||
                ((envelopeOne.getHeight() < envelopeTwo.getWidth()) && (envelopeOne.getWidth() < envelopeTwo.getHeight()))) {

            System.out.println("Second envelope can contain first.");

        } else {
            System.out.println("Envelopes can't contain one other.");
        }

    }

    private void printHelp() {
        System.out.println("This application check the possibility to enclose one envelope in another.\n" +
                "You may use a floating-point format.");
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EnvelopeAnalysis analysis = new EnvelopeAnalysis();
        analysis.createEnvelopes(scanner, 2);
        analysis.compareEnvelopes(1, 2);



    }
}
