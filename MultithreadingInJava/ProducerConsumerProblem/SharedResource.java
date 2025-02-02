package MultithreadingInJava.ProducerConsumerProblem;

import java.util.*;

public class SharedResource {
    private Queue<Integer> queue;
    private int bufferSize;

    public SharedResource(int bufferSize) {
        this.bufferSize = bufferSize;
        queue = new LinkedList<>();
    }
    public synchronized void produce(int item) throws InterruptedException{
        while (queue.size()==bufferSize) {
            System.out.println("Queue is full. Producer is waiting...");
            wait();
        }
        queue.add(item);
        System.out.println("Producer produced: " + item);
        notify();
    }
    
    public synchronized int consume() throws Exception{
        while(queue.isEmpty()){
            System.out.println("Queue is empty. Consumer is waiting...");
            wait();
        }
        int item = queue.poll();
        System.out.println("Consumer consumed: " + item);
        notify();
        return item;
    }

}
