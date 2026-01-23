package Advance;
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayList2D {
	public static void exec() {
		ArrayList<ArrayList<Integer>> arr=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter superarray size: ");
		int size=sc.nextInt();
		int size2=4;
		for(int i=0;i<size;i++) {
			ArrayList<Integer> temp=new ArrayList<>();
			for(int j=0;j<size2;j++) {
				int temp1=sc.nextInt();
				temp.add(temp1);
			}
			arr.add(temp);
		}
		for (ArrayList<Integer> row : arr) {
            for (int item : row) {
                System.out.print(item + " ");
            }
            System.out.println();
        }
	}
}
