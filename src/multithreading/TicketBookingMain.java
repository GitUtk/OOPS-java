package multithreading;

import java.util.*;

class TicketBooking {
    List<Integer> tickets = new ArrayList<>();
    TicketBooking() {
        for (int i = 1; i <= 5; i++) {
            tickets.add(i);
        }
    }
    synchronized void bookTicket(String customer) {
        if (tickets.isEmpty()) {
            System.out.println(customer + ": Tickets sold out");
            return;
        }
        System.out.println(customer + ": Ticket successfully booked with ID " + tickets.get(0));
        tickets.remove(0);
    }
}

class BookingCounter implements Runnable {
    TicketBooking tb;
    String customer;
    BookingCounter(TicketBooking tb, String customer) {
        this.tb = tb;
        this.customer = customer;
    }
    @Override
    public void run() {
        tb.bookTicket(customer);
    }
}

public class TicketBookingMain {
    public static void main(String[] args) throws InterruptedException {
        TicketBooking booking = new TicketBooking();
        Thread t1 = new Thread(new BookingCounter(booking, "Customer 1"));
        Thread t2 = new Thread(new BookingCounter(booking, "Customer 2"));
        Thread t3 = new Thread(new BookingCounter(booking, "Customer 3"));
        Thread t4 = new Thread(new BookingCounter(booking, "Customer 4"));
        Thread t5 = new Thread(new BookingCounter(booking, "Customer 5"));
        Thread t6 = new Thread(new BookingCounter(booking, "Customer 6"));
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t1.join();
        t2.join();
        t3.join();
        t4.join();
        t5.join();
        t6.join();
        System.out.println("All customers have completed booking.");
    }
}