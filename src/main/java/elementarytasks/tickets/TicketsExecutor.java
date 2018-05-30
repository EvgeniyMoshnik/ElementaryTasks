package elementarytasks.tickets;

import elementarytasks.Constants;
import elementarytasks.Parameter;
import elementarytasks.Validator;

import java.util.List;
import java.util.Scanner;

public class TicketsExecutor {

    static String help = "Application Tickets. \n" +
            "If 1 params application will calculate count lucky tickets exists.\n" +
            "If 2 params application will calculate count lucky tickets your.\n";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countLucky;
        while (true) {
            String params = Parameter.enterParameters(scanner, Constants.MESSAGE_ENTER_TICKET);
            params = params.replaceAll("[\\s]", "");
            List<String> paramsList = Parameter.parseParams(params);
            if (!Validator.isParams(paramsList, help, 0)) {
                continue;
            }
            String path = paramsList.get(0);
            TicketsList ticketsList = new TicketsList();
            String algorithm = ticketsList.readFileForChooseAlgorithm(path);
            if (paramsList.size() == 1) {
                countLucky = ticketsList.countAllLuckyTickets(algorithm);
                System.out.println("Lucky tickets (" + algorithm + " algorithm) : " + countLucky + " of 999999.");
            } else {
                String pathTickets = paramsList.get(1);
                List<Ticket> tickets = ticketsList.readFileTickets(pathTickets);
                countLucky = ticketsList.countLuckyTickets(algorithm, tickets);
                System.out.println("You have lucky tickets (" + algorithm + " algorithm) : " + countLucky + ".");
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
