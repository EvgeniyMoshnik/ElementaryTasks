package tickets;

import elementarytasks.tickets.Ticket;
import elementarytasks.tickets.TicketsList;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class TicketsListTest {
    private List<Ticket> ticketsLists;
    TicketsList ticketsList;


    @Before
    public void setUp() throws Exception {
        ticketsLists = new ArrayList<>();
        ticketsList = new TicketsList();
    }



    @Test
    public void countLuckyTicketsMoscow() {
        String algorithm = "Moscow";
        ticketsLists.add(new Ticket(394939));
        ticketsLists.add(new Ticket(452229));
        ticketsLists.add(new Ticket(555555));
        ticketsLists.add(new Ticket(990909));
        ticketsLists.add(new Ticket(354664));
        int expected = 2;
        int actual = ticketsList.countLuckyTickets(algorithm, ticketsLists);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void countLuckyTicketsPeter() {
        String algorithm = "Peter";
        ticketsLists.add(new Ticket(394939));
        ticketsLists.add(new Ticket(402033));
        ticketsLists.add(new Ticket(258005));
        ticketsLists.add(new Ticket(990909));
        ticketsLists.add(new Ticket(220233));
        int expected = 3;
        int actual = ticketsList.countLuckyTickets(algorithm, ticketsLists);
        Assert.assertEquals(expected, actual);
    }

    //    @Test
    //   public void readFileTickets() {
    //       Scanner mock = mock(Scanner.class);
    //       String parh = "";
    //       when(mock.next()).thenReturn("394939").thenReturn("40203344").thenReturn("220233").
    //              thenReturn("sdfs").thenReturn(null);

    //      ticketsLists.add(new Ticket(394939));
    //     ticketsLists.add(new Ticket(220233));
    //    List<Ticket> expected = ticketsLists;
    //    List<Ticket> actual;

    //  }

    @After
    public void tearDown() throws Exception {
        ticketsLists.clear();
    }

}