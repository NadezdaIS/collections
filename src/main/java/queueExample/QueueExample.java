package queueExample;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

    /*
     * FIFO - First in First Out
     * LIFO - Last in first out
     *
     * Queue system
     * Events - Apache Kafka
     * Transactions - payments
     *
     *
     * */



    public void exampleQueueWithString(){
        Queue<String> customers = new LinkedList<>();

        customers.offer("Zino");
        customers.offer("Paulina");
        customers.offer("Sandra");
        customers.offer("Julija");
        customers.offer("Linda");

        System.out.println(customers);

        System.out.println(customers.peek()); // will preview the first customer in queue, does not remove

        this.attendToCustomer(customers.poll()); // will remove the first customer from queue
        this.attendToCustomer(customers.poll());
        this.attendToCustomer(customers.poll());
        this.attendToCustomer(customers.poll());
        System.out.println(customers);
        System.out.println("we processed all customers: " + customers.isEmpty());

        this.attendToCustomer(customers.poll());

        System.out.println("we processed all customers: " + customers.isEmpty());


        customers.offer("Paulina");
        customers.offer("Sandra");
        customers.offer("Julija");
        customers.offer("Linda");
        System.out.println(customers.remove()); // throws exception  if no elements
        System.out.println(customers.poll()); // returns null if no elements

        System.out.println(customers.element());// throws exception  if no elements
        System.out.println(customers.peek()); // returns null if no elements

    }

    public void attendToCustomer(String customer) {
        System.out.println("now attending to: " + customer);
    }
}

