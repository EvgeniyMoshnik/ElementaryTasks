package tickets;

import elementarytasks.tickets.Ticket;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TicketTest {


    @Test
    public void isLuckyMoscowTrue() {
        Assert.assertTrue(Ticket.isLuckyMoscow(123321));
    }

    @Test
    public void isLuckyMoscowFalse() {
        Assert.assertFalse(Ticket.isLuckyMoscow(432301));
    }

    @Test
    public void isLuckyPeterTrue() {
        Assert.assertTrue(Ticket.isLuckyPeter(302322));
    }

    @Test
    public void isLuckyPeterFalse() {
        Assert.assertFalse(Ticket.isLuckyPeter(801311));
    }
}