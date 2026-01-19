package Questions;
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListIsPlaindrome {
    public static void execution() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter the elements:");
        for (int i = 0; i < size; i++) {
            list.add(sc.nextInt());
        }
        int left = 0;
        int right = list.size()-1;
        boolean flag = true;
        while (left < right) {
            if (list.get(left)!=list.get(right)) {
                flag = false;
                break;
            }
            left++;
            right--;
        }
        if (flag) {
            System.out.println("ArrayList is palindrome");
        } else {
            System.out.println("ArrayList is not palindrome");
        }
        sc.close();
    }
}

