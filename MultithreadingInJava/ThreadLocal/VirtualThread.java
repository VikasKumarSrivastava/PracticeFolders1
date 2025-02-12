package MultithreadingInJava.ThreadLocal;

public class VirtualThread {
    public static void main(String[] args) {
        try {
          
            // Initialization of thread
          Thread.Builder builder = Thread.ofVirtual().name("GFG Thread");

          Runnable task = () -> {
              System.out.println("Running thread");
          };

          Thread t = builder.start(task);

          System.out.println("Thread t name: " + t.getName());

          // Add a delay to allow the virtual thread to run
            // Sleep for 1 second
          Thread.sleep(1000); 

          // Wait for the thread to complete
          t.join();
      } catch (InterruptedException e) {
          e.printStackTrace();
      }
    }
}




