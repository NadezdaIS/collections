import listExamples.ListExamples;
import mapExamples.MapExample;
import queueExample.DeQueueExample;
import queueExample.QueueExample;
import setExamples.SetExample;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        SetExample setExample = new SetExample();
        System.out.println("===Set examples ===");
        System.out.println("=== hash set example ==");
        setExample.exampleHashSet();

        System.out.println("=== hash set with Object example ==");
        setExample.exampleHashSetWithCustomType();

        setExample.exampleTreeSet();

        System.out.println("=== Example LinkedHasSet ===");
        setExample.exampleLinkedHashSet();


        ListExamples listExamples = new ListExamples();
        listExamples.exampleListWIthStringItems();

        listExamples.exampleLinkedList();

        System.out.println("=== Example QueueExample ===");
        QueueExample queueExample = new QueueExample();
        queueExample.exampleQueueWithString();

        System.out.println("=== Example DeQueExample ===");
        DeQueueExample deQueueExample = new DeQueueExample();
        deQueueExample.exampleDeque();


        System.out.println("=== Example HashMapExample ===");
        MapExample mapExample = new MapExample();
        mapExample.firstExampleWIthHashMap();

        System.out.println("=== Another Example CRUD HashMapExample ===");
        mapExample.secondExampleWIthHashMap();

        System.out.println("=== Example HashMap with Object ===");
        mapExample.thirdExampleWithHashMapUsingObject();

        System.out.println("=== Example TreeMap with Primitive types ===");
        mapExample.firstExampleUsingTreeMap();

        System.out.println("=== Example LinkedHashMap with  Objects ===");
        mapExample.firstExampleUsingLinkedHashMap();


    }
}
