package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Ticket;

import static org.junit.jupiter.api.Assertions.*;

class TicketManagerTest {
    @Test
    void getRepository() {
    }

    @Test
    void setRepository() {
    }

    @Test
    void findTickets() {
        Ticket ticketOne = new Ticket(1, 10_000, "OVB", "IRA", 100);
        Ticket ticketTwo = new Ticket(2, 12_000, "LED", "KUF", 120);
        Ticket ticketThree = new Ticket(3, 100_000, "FRU", "EGO", 180);

        Ticket[] expected = new Ticket[]{ticketOne};
        TicketManager manager = new TicketManager();
        manager.add(ticketOne);
        manager.add(ticketTwo);
        manager.add(ticketThree);

        assertArrayEquals(expected, manager.findAll("OVB", "IRA"));
    }

    @Test
    void findAll() {
    }

    @Test
    void matches() {
    }
}