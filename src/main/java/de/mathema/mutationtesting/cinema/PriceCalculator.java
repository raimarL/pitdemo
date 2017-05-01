package de.mathema.mutationtesting.cinema;

import java.util.List;

/**
 * Created by rai on 24.04.17.
 */
public class PriceCalculator {

    public int calculateTotalPrice(List<Ticket> tickets) {
        int totalPrize = 0;
        int validTickets = 0;
        int canceledTickets = 0;
        for(Ticket ticket : tickets) {
            if(!ticket.isStorniert()) {
                validTickets++;
                totalPrize += calculateTicketPrice(ticket);
            }
            else {
                canceledTickets++;
            }
        }

        if(validTickets >= 3 && canceledTickets == 0) {
            totalPrize -= 5; // 5 EUR Mengenrabatt, falls keine Stornierungen
        }

        return totalPrize;
    }

    private int calculateTicketPrice(Ticket ticket) {
        int ticketPrize = ticket.getPrice();
        if(ticket.isFSK18()) {
            ticketPrize += 1; // Alterskontrolle + 1 EUR
        }
        if(ticket.isDeluxeSeat()) {
            ticketPrize += 5; // besserer Sitz + 5 EUR
        }
        if (ticket.is3D() || ticket.isOverlong()) {
            ticketPrize += 2; // 3D oder überlang + 2 EUR
        }
        return ticketPrize;
    }
}
