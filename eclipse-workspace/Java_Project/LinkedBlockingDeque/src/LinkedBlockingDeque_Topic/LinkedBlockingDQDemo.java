package LinkedBlockingDeque_Topic;



import java.util.concurrent.BlockingDeque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;

public class LinkedBlockingDQDemo {
    public static void main(String[] args) {
        SharedClass buffer = new SharedClass();
        // Starting two threads
        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.execute(new Producer(buffer));
        executor.execute(new Consumer(buffer));
        executor.shutdown();

    }
}
/**
 * 
 */
class Producer implements Runnable{
    SharedClass buffer;
    Producer(SharedClass buffer){
        this.buffer = buffer;
    }
    @Override
    public void run() {
        for(int i = 0; i < 10; i++){
            buffer.put(i);
            if(i == 4){
                try {
                    // introducing some delay using sleep
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
    }
}
/**
 * 
 */
class Consumer implements Runnable{
    SharedClass buffer;
    Consumer(SharedClass buffer){
        this.buffer = buffer;
    }
    @Override
    public void run() {
        for(int i = 0; i < 10; i++){
            buffer.get();;
        }
    }    
}

//Shared class used by threads
class SharedClass{
    int i;
    // Bounded LinkedBlockingDeque of size 10
    BlockingDeque<Integer> linkedBlockingDeque = new LinkedBlockingDeque<Integer>(10);
    
    public void get(){
       try {
            // take method to get from blockingdeque
           System.out.println("Consumer recd - " + linkedBlockingDeque.take());
       } catch (InterruptedException e) {
            // TODO Auto-generated catch block
           e.printStackTrace();
       }
    }
    
    public void put(int i){
       this.i = i;
       try {
            // putting in blocking deque
            linkedBlockingDeque.put(i);
            System.out.println("Putting - " + i);
       }
       catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
       } 
    }
}