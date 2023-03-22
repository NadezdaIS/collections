package queueExample;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.NoSuchElementException;

public class DeQueueExample {

    public void exampleDeque(){
        Deque<String> cars = new ArrayDeque<>();

        cars.offer("Nissan");
        cars.offer("BMW");
        cars.addFirst("Toyota");
        cars.addFirst("Porshe");
        cars.addLast("Audi");
        cars.offer("Volvo");
        cars.addFirst("Ferrari");
        cars.offer("Mercedes");
        cars.offer("Volkswagen");
        cars.addFirst("Honda");
        cars.offer("Mazda");

        System.out.println(cars);

        System.out.println(cars.peekFirst());
        System.out.println(cars.peekLast());
        System.out.println(cars.pollFirst());
        System.out.println(cars.pollLast());

        // these will throw exception if item not found / in the list

        try {
            cars.remove();
            cars.removeLast();
            cars.removeFirst();

            cars.getFirst();
            cars.getLast();
        } catch (NoSuchElementException exception){
            System.out.println(exception);
        }

        System.out.println(cars);
    }
}
