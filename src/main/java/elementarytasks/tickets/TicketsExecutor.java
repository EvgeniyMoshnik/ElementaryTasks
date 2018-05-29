package elementarytasks.tickets;

import java.util.Scanner;

public class TicketsExecutor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String path = "Algorithm.txt";
        TicketsList ticketsList = new TicketsList();
        String algorithm = ticketsList.readFileForChooseAlgorithm(path);
        System.out.println(ticketsList.countAllLuckyTickets(algorithm));

    }
}
