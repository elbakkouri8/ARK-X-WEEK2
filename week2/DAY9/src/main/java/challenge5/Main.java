package challenge5;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> queue = new LinkedList<>();
        LinkedList<String> queue1 = new LinkedList<>();


        System.out.println(queue);
        queue.add("mohamed");
        System.out.println(queue);
        queue.add("hassan");
        System.out.println(queue);
        queue.add("brahim");
        System.out.println(queue);
        queue.add("hamid");
        System.out.println(queue);
        queue.add("said");
        System.out.println(queue);

        queue.remove("hassan");
        System.out.println(queue);

        System.out.println("size of the queue is : " + queue.size());

        for(String s : queue){
            queue1.add(0,s);
        }

        System.out.print("Reverse the linked list : ");
        System.out.println(queue1);


    }
}
