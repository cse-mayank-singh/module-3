package ExceptionHandeling;
public class DBMS{
	public static void create(Student student) {
		if(student != null) {
			student.displayStudentDetails();}
		else {
			throw new StudentNotFoundException();
		}
	}
}
