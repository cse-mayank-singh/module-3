/**
 * 
 */
package Advance;

/**
 * 
 */
public class MyThread2 implements Runnable {
    Resource res;
    public MyThread2(Resource res) {
        this.res = res;
    }
    @Override
    public void run() {
        res.data(5);
    }
}

