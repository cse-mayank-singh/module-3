/**
 * 
 */
package Advance;

/**
 * 
 */
public class MyThread1 implements Runnable{
	Resource res;
	public MyThread1(Resource res) {
		super();
		this.res=res;
	}
	@Override
	public void run() {
		res.data(2);
	}
}
