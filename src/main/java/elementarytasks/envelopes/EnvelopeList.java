package elementarytasks.envelopes;

import elementarytasks.Parameter;
import elementarytasks.Validator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EnvelopeList {

    private List<Envelope> listEnvelope = new ArrayList<>();

    List<Envelope> createEnvelopes(Scanner scanner, String help) {
        double width;
        double height;
        Envelope envelope;
        int numEnvelope = 1;
        do {
            System.out.print("Enter width envelope № " + numEnvelope + ":\t");
            width = Parameter.toDoubleParameter(scanner, help);
            System.out.print("Enter height envelope № " + numEnvelope + ":\t");
            height = Parameter.toDoubleParameter(scanner, help);
            scanner.nextLine();
            envelope = new Envelope(width, height);
            addEnvelope(envelope);
            numEnvelope++;
        } while (numEnvelope < 3);
        return listEnvelope;
    }


    void addEnvelope(Envelope envelope) {
        listEnvelope.add(envelope);
    }

    String compareEnvelopes() {
        Envelope first = listEnvelope.get(0);
        Envelope second = listEnvelope.get(1);
        double firstWidth = first.getWidth();
        double firstHeight = first.getHeight();
        double secondWidth = second.getWidth();
        double secondHeight = second.getHeight();
        String result;

        if ((firstWidth > secondWidth) && (firstHeight > secondHeight) ||
                ((firstWidth > secondHeight) && (firstHeight > secondWidth))) {
            result = "First envelope can contain second.";
        } else if ((firstWidth < secondWidth) && (firstHeight < secondHeight) ||
                ((firstWidth < secondHeight) && (firstHeight < secondWidth))) {
            result = "Second envelope can contain first.";
        } else {
            result = "Envelopes can't contain one other.";
        }
        return result;
    }


  //  double toDoubleParameter(String param, String help) {
 //       double result;
   //     while (!Validator.isNumberDouble(param)) {
     //       if (param.length() == 0) {
       //         System.out.println(help + "\n" +
       //                 "Please enter again parameter.");
       //     } else {
       //         System.out.println("Parameter should be number! \n" +
        //                "Please enter again parameter.");
        //    }
     //   }
      //  result = Double.parseDouble(param);
     ///   return result;
   // }
}
