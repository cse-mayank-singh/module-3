package ExceptionHandeling;
public class ExceptionMethods {
	public static void exec() {
		int i=10;
		int j=0;
		try {
			int q=i/j;
			System.out.println("Division of "+i+" and "+j+" is: "+q);
		}
		catch(ArithmeticException arithmeticException){
			System.out.println(arithmeticException.getMessage());
			System.out.println(arithmeticException.toString());
			arithmeticException.printStackTrace();
		}
	}
}
