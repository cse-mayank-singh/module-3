package ExceptionHandeling;
public class NullPointerExc {
	public static void exec() {
		try {
		String ahh=null;
		System.out.println(ahh+" "+ahh.length());
		}catch(NullPointerException e){
			System.out.println("null pointer exception, null length cannot be calculated");
		}
	}
}
