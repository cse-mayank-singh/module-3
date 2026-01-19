package Questions;
import java.util.Scanner;
public class Party {
	public static void execute() {
		int bad=0;
		int good=1;
		int great=2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter candies: ");
		int candy=sc.nextInt();
		System.out.println("Enter tea: ");
		int tea=sc.nextInt();
		if(candy>=5&&tea>=5) {
			if(candy==5 && tea==5) {
				System.out.println("Good Party with equal tea and candy, encoded value is "+good);
			}
			else if(candy==2*tea || tea==2*candy){
				System.out.println("Great Party, encoded value is "+great);
			}else {
				System.out.println("Good Party, encoded value is "+good);}
		}else {
			System.out.println("Bad Party, encoded value is "+bad);
		}
		sc.close();
	}
}
