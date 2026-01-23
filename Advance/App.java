/**
 * 
 */
package Advance;

/**
 * 
 */
//array sorting
//number sorting
//string sorting;
public interface App {
	public static void exec() {
//		BubbleSort.exec();
//		ArraySorting.exec();
//		StringSorting.exec();
//		ArrayList2D.exec();
		
		//Threading
//		MyThread t=new MyThread();
//		Thread thread=new Thread(t);
//		thread.start();
		
		Resource res=new Resource();
		MyThread1 mt1=new MyThread1(res);
		Thread t1=new Thread(mt1);
		t1.start();
		MyThread2 mt2=new MyThread2(res);
		Thread t2=new Thread(mt2);
		t2.start();
 	}
}
