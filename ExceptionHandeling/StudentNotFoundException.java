/**
 * 
 */
package ExceptionHandeling;

/**
 * 
 */
public class StudentNotFoundException extends RuntimeException{
	@Override
	public String getMessage() {
	return "Student Doesn't Exists!" ;
	}
}
