package elementarytasks.tickets;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TicketsList {

    private static final String MOSCOW_ALGORITHM = "Moscow";
    private static final String PETER_ALGORITHM = "Peter";

    private List<Ticket> tickets = new ArrayList<>();

    String readFileForChooseAlgorithm(String path) {
        String algorithm = "";
        try (BufferedReader br =
                     new BufferedReader(new FileReader(path))) {
            Scanner scanner = new Scanner(br);
            algorithm = scanner.next();
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (IOException e) {
            System.out.println("Incorrect data!");
        }
        return algorithm;
    }

    int countAllLuckyTickets(String algorithm) {
        int count = 0;
        if (algorithm.equals(MOSCOW_ALGORITHM)) {
            for (int i = 1000; i < 1000000; i++) {
                if (Ticket.isLuckyMoscow(i)) {
                    count++;
                }
            }
        }
        if (algorithm.equals(PETER_ALGORITHM)) {
            for (int i = 100; i < 1000000; i++) {
                if (Ticket.isLuckyPeter(i)) {
                    count++;
                }
            }
        }
        return count;
    }

    public List<Ticket> readFileTickets(String path) {
        int ticket;
        try (BufferedReader br =
                     new BufferedReader(new FileReader(path))) {
            Scanner scanner = new Scanner(br);
            while (scanner.hasNextInt()) {
                ticket = scanner.nextInt();
                if (Ticket.isTicket(ticket)) {
                    tickets.add(new Ticket(ticket));
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (IOException e) {
            System.out.println("Incorrect data!");
        }
        return tickets;
    }

    public int countLuckyTickets(String algorithm, List<Ticket> tickets) {
        int count = 0;
        if (algorithm.equals(MOSCOW_ALGORITHM)) {
            for (Ticket ticket : tickets) {
                if (Ticket.isLuckyMoscow(ticket.getNumberTicket())) {
                    count++;
                }
            }
        }
        if (algorithm.equals(PETER_ALGORITHM)) {
            for (Ticket ticket : tickets) {
                if (Ticket.isLuckyPeter(ticket.getNumberTicket())) {
                    count++;
                }
            }
        }
        return count;
    }
}