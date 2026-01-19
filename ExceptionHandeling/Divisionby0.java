package ExceptionHandeling;
public class Divisionby0 {
	public static void exec() {
		int i=10;
		int j=0;
		try {
			int q=i/j;
			System.out.println("Division of "+i+" and "+j+" is: "+q);
		}
		catch(ArithmeticException arithmeticException){
			System.out.println("0 se divide karinga to danger ho jaenga");
		}
	}
}
