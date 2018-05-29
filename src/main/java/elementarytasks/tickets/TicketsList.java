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

    List<Ticket> tickets = new ArrayList<>();

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
}
