package challenge4;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("mohamed","brahim", "said", "mohamed","mouad"));
        QueueImplementation queue = new QueueImplementation(list);


        queue.Affiche();
        queue.Enqueue("el bakkouri");
        queue.Affiche();
        queue.Dequeue();
        queue.Affiche();
        System.out.println("the peek of the queue is : " +queue.Peek());
        queue.Affiche();

    }
}
