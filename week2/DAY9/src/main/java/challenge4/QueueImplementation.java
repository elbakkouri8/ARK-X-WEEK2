package challenge4;

import java.util.ArrayList;

public class QueueImplementation {

    public ArrayList<String> queue;

    public QueueImplementation(ArrayList<String> queue) {
        this.queue = queue;
    }

    public void Enqueue(String s){
        queue.add(s);
    }

    public void Dequeue(){
        queue.remove(0);
    }

    public String Peek(){
        return queue.get(0);
    }

    public boolean isEmpty(){
        return queue.isEmpty();
    }

    public void Affiche(){
        System.out.println(queue);
    }
}
