package de.mathema.mutationtesting.cinema;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rai on 25.04.17.
 */

public class PriceCalculatorTest {

    private PriceCalculator priceCalculator;

    @Before
    public void init() {
        priceCalculator = new PriceCalculator();
    }

    @Test
    public void stornoTicketWithAllExtras() {
        List<Ticket> tickets = new ArrayList<Ticket>();
        Ticket ticket = new Ticket(10, true, true,
                true, true, true);
        tickets.add(ticket);
        Assert.assertEquals(priceCalculator.calculateTotalPrice(tickets), 0);
    }

    @Test
    public void fiveStandardTicketsWithAllExtras() {
        List<Ticket> tickets = new ArrayList<Ticket>();
        for(int i = 0; i < 5; i++) {
            tickets.add(new Ticket(1, true,true,
                    true, true, false));
        }
        Assert.assertEquals(priceCalculator.calculateTotalPrice(tickets), 45-5);
    }

    // um Tests erweitern ...
}


