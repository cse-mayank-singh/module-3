package ExceptionHandeling;
import java.util.ArrayList;
public class IndexOuttaBound {
	public static void exec() {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(1);al.add(2);
		String ahh="Rani@1234";
		try {
			for(int i=0;i<=al.size();i++) {
				System.out.println(al.get(i));
			}
		}catch(IndexOutOfBoundsException e) {
			System.out.println("i is getting called as <=length which will be out of bounds");
		}
		try {
			for(int i=0;i<=ahh.length();i++) {
				System.out.println(ahh.charAt(i));
			}
		}catch(StringIndexOutOfBoundsException e) {
				System.out.println("i is getting called as <=length which will be out of bounds");
		}
	}
}
