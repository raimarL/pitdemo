package de.mathema.mutationtesting.cinema;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rai on 25.04.17.
 */
public class PriceCalculatorTest_MS {

    private PriceCalculator priceCalculator;

    @Before
    public void init() {
        priceCalculator = new PriceCalculator();
    }

    @Test
    public void stornoTicketWithAllExtras() {
        List<Ticket> tickets = new ArrayList<Ticket>();
        Ticket ticket = new Ticket(10, true, true, true, true, true);
        tickets.add(ticket);
        Assert.assertEquals(priceCalculator.calculateTotalPrice(tickets), 0);
    }

    @Test
    public void fiveStandardTicketsWithAllExtras() {
        List<Ticket> tickets = new ArrayList<Ticket>();
        for(int i = 0; i < 5; i++) {
            tickets.add(new Ticket(1, true,true, true, true, false));
        }
        Assert.assertEquals(priceCalculator.calculateTotalPrice(tickets), 45-5);
    }

    // canceledTickets++ --> canceledTickets--
    // äquivalenter Mutant! Wir stellen hier nur fest, dass Ungleichheit herrscht. Es ist egal in welche "Richtung".


    // 3 Standard Tickets führen zu 5 EUR Rabatt!

    @Test
    public void threeStandardTicketsWithAllExtras() {
        List<Ticket> tickets = new ArrayList<Ticket>();
        for(int i = 0; i < 3; i++) {
            tickets.add(new Ticket(1, true,
                    true, true, true, false));
        }
        Assert.assertEquals(priceCalculator.calculateTotalPrice(tickets), 22);
    }

    // !overlong bzw. !3D muss geprüft werden
    @Test
    public void standardTicketNotOverlong() {
        List<Ticket> tickets = new ArrayList<Ticket>();
        Ticket ticket = new Ticket(1, true, false, true, true, false);
        Ticket ticket2 = new Ticket(1, true, true, false, true, false);
        tickets.add(ticket);
        tickets.add(ticket2);
        Assert.assertEquals(priceCalculator.calculateTotalPrice(tickets), 18);
    }
}
