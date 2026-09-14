class TicketCounter implements Runnable{
    int availableTicket=10;
    synchronized void bookTickets(){
        if(availableTicket>0){
            availableTicket = availableTicket-1;
                    System.out.println("Tickey booked by " + Thread.currentThread().getName());
                    System.out.println("left tickets "+ availableTicket);
        }else{
            System.out.println("Tickets are sold out");
        }   
    }
    public void run()
    {
        while(availableTicket>0)
        {
            bookTickets();
        }
    }
}

public class useCase5 {
    public static void main(String[] args) {
        TicketCounter counter = new TicketCounter();
        Thread t1 = new Thread(counter);
        Thread t2 = new Thread(counter);
        t2.setPriority(10);
        t1.setName("Counter 1");
        t2.setName("Counter 2");
        t1.start();
        t2.start();
    }
}
