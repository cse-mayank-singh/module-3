/**
 * 
 */
package Advance;

/**
 * 
 */
public class Resource {
    // synchronized method to avoid race condition
    public synchronized void data(int x) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName()
                    + " : " + (x * i));
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

