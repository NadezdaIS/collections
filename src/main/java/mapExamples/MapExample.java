package mapExamples;

import model.Product;
import model.Student;

import java.util.*;

public class MapExample {

    public void firstExampleWIthHashMap(){
        Map<String, Integer> studentScores = new HashMap<>();

        studentScores.put("Zino", 56);
        studentScores.put("Sabine", 200);
        studentScores.put("Rasa", 90);
        studentScores.put("Sandra", 100);
        studentScores.put("Inga", 70);

        // finding items by key with get
        System.out.println(studentScores.get("Zino"));

        // adding or updating can be with put
        studentScores.put("Zino", 89);

        System.out.println(studentScores.get("Zino"));

        //display all items
        System.out.println(studentScores);
    }

    public void secondExampleWIthHashMap(){
        // this is empty map ready to add values
        Map<String, Integer> studentScores = new HashMap<>();

        // add values
        studentScores.put("Zino", 99);
        studentScores.put("Julija", 100);

        System.out.println(studentScores);
        // find values by key
        System.out.println(studentScores.get("Zino"));
        System.out.println(studentScores.get("Julija"));

        // throws exception if key does not exist
        //System.out.println(studentScores.get("James"));

        // delete value by key
        studentScores.remove("Zino");

        // update value by key
        studentScores.put("Julija", 150);

        System.out.println(studentScores);

        studentScores.put("Paulina", 45);
        studentScores.put("Nadezda", 75);
        studentScores.put("Linda", 96);

        System.out.println("Paulina in list? " + studentScores.containsKey("Paulina"));
        System.out.println("Zino in list? " + studentScores.containsKey("Zino"));

        System.out.println("Any student scored 100? " + studentScores.containsValue(100));
        System.out.println("Any student scored 150? " +  studentScores.containsValue(150));

        System.out.println("All Students: " +  studentScores.keySet());
        System.out.println("All Scores: " +  studentScores.values());


        Integer scoreToFind = 150;
        studentScores.values().forEach(value -> {
            if (Objects.equals(value, scoreToFind)){
                // do something important or return it
                System.out.println("Found the score!!: " + value);
            }
        });
    }

    public void thirdExampleWithHashMapUsingObject(){
        Map<UUID, Student> students = new HashMap<>();

        students.put(UUID.randomUUID(), new Student("Zino", 56));
        students.put(UUID.randomUUID(), new Student("Linda", 70));
        students.put(UUID.randomUUID(), new Student("Anastasija", 129));
        students.put(UUID.randomUUID(), new Student("Signe", 40));
        students.put(UUID.randomUUID(), new Student("Signe", 40));

        System.out.println(students);

        System.out.println(students.keySet());
        System.out.println(students.values());

        for (Map.Entry<UUID, Student> currentStudent: students.entrySet()){
            // so some stuff with key or and value
            System.out.println(
                    "Key: " + currentStudent.getKey() +
                            "value: " + currentStudent.getValue()
            );
        }

        System.out.println("=== example with for each ====");
        students.forEach((key, value) -> System.out.println(key + " -- " + value));
    }

    public void firstExampleUsingTreeMap() {
        TreeMap<Integer, String> students = new TreeMap<>();

        students.put(7, "Zino");
        students.put(3, "Linda");
        students.put(5, "Yevheniia");
        students.put(45, "Signe");
        students.put(2, "Anastasija");

        System.out.println(students);

        students.forEach((key, value) -> {
            // do  more stuff
            System.out.println("Student Id: " + key + "student name "+ value );
        });
    }

    public void firstExampleUsingLinkedHashMap(){

        Map<UUID, Product> listOfProducts = new LinkedHashMap<>();

        listOfProducts.put(UUID.randomUUID(), new Product("Rice", 50.5));
        listOfProducts.put(UUID.randomUUID(), new Product("Milk", 102.43));
        listOfProducts.put(UUID.randomUUID(), new Product("Apple", 4.56));
        listOfProducts.put(UUID.randomUUID(), new Product("Chocolate", 1.50));

        UUID id = UUID.randomUUID();

        listOfProducts.put(id, new Product("Cookie", 40.50));
        System.out.println(listOfProducts);
        // update
        listOfProducts.put(id, new Product("Cookie", 56.70));

        for (Map.Entry<UUID, Product> currentProduct: listOfProducts.entrySet()){

            // if value match we can update this way
            if (currentProduct.getValue().getName().equals("Rice")){
                currentProduct.setValue(new Product("Rice", 1245.60));
            }

            // another way to change value
            if (currentProduct.getValue().getName().equals("Milk")){
                currentProduct.getValue().setPrice(344.50);
            }
        }

        System.out.println("==Final List of products===");
        System.out.println(listOfProducts);
    }
}

