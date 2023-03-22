import listExamples.ListExamples;
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

    }
}
