package listExamples;

import model.Product;

import java.util.*;

public class ListExamples {

    public void exampleListWIthStringItems() {
        System.out.println("===  Example List with String ===");
        List<String> productNames = new ArrayList<>();

        productNames.add("Rice");
        productNames.add("Milk");
        productNames.add("Bread");
        productNames.add("Bread");
        productNames.add("Soap");
        productNames.add("Milk");

        System.out.println(productNames);

        System.out.println("===  Example List with Object ===");
        List<Product> products = new ArrayList<>();

        products.add(new Product("rice", 300.34));
        products.add(new Product("milk", 140.43));
        products.add(new Product("rice", 54.34));
        products.add(new Product("book", 4562.76));
        products.add(new Product("phone", 234.99));

        for (Product currentProduct: products){
            System.out.println(currentProduct.getName() + " - " + currentProduct.getPrice());
        }

        // Collections class provides more methods for manipulating, accessing and working with list
        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product product1, Product product2) {
                if (product1.getPrice() == product2.getPrice()) return 0;

                /* this is the same as line 45, line 45 is the ternary operator version of this code
                if (product1.getPrice() > product2.getPrice()) return -1;
                if (product1.getPrice() < product2.getPrice()) return 1;*/

                return product1.getPrice() > product2.getPrice() ? -1 : 1;
            }
        });

        System.out.println("=== sorted products ===");
        products.forEach(System.out::println);

        Collections.reverse(products);

        System.out.println(products);

    }

    public void exampleLinkedList(){
        LinkedList <String> studentNames = new LinkedList<>();

        studentNames.add("Zino");
        studentNames.add("Rita");
        studentNames.add(1,"Irina");
        studentNames.add(0, "Kristina");
        studentNames.add(2, "Karolina");
        studentNames.add("Julija");

        System.out.println("=== Linked list Example ===");
        System.out.println(studentNames);
    }
}

