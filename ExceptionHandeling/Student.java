/**
 * 
 */
package ExceptionHandeling;

/**
 * 
 */
public record Student(Integer id, String name) {
	public void displayStudentDetails() {
	System.out.println( "Student Details");
	System.out.println("Id is: "+id+" name is "+name);
	}
}