package ExceptionHandeling;
public class ThrowableClass {
	public static void exec() {
	String ahh="NOINOINOI";
	try {
		for(int i=0;i<=ahh.length();i++) {
			System.out.println(ahh.charAt(i));
		}
	}catch(Throwable e) {
			e.printStackTrace();
			System.out.println("i is getting called as <=length which will be out of bounds");
		}
	}
}
