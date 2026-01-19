package Questions;
import java.util.Scanner;
public class StrictlyIncreasing {
    public static int digitSize(int digit) {
        int size = 0;
        while (digit != 0) {
            digit /= 10;
            size++;
        }
        return size;
    }
    static int[] reverse(int[] arr) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return arr;
    }
    public static void strictlyIncreasing(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] - arr[i + 1] != -1) {
                System.out.println("Not !!!!!!! Strictly Increasing");
                return;
            }
        }
        System.out.println("--------------------------------Strictly Increasing----------------------------------------");
    }
    public static void strictlyDecreasing(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] - arr[i + 1] != 1) {
                System.out.println("Not !!!!!! Strictly Decreasing");
                return;
            }
        }
        System.out.println("--------------------------------Strictly Decreasing-------------------------------------");
    }
    public static void increasingThenDecreasing(int[] arr) {
        if (arr.length % 2 == 0) {
            System.out.println("Not !!!! (Increasing then Decreasing)");
            return;
        }
        int mid = arr.length / 2;
        for (int i = 0; i < mid; i++) {
            if (arr[i] - arr[i + 1] != -1) {
                System.out.println("Not !!!! (Increasing then Decreasing) ");
                return;
            }
        }
        for (int i = mid; i < arr.length - 1; i++) {
            if (arr[i] - arr[i + 1] != 1) {
                System.out.println("Not !!!! (Increasing then Decreasing) ");
                return;
            }
        }
        System.out.println("-------------------------Strictly Increasing then Decreasing--------------------------------");
    }
    public static void decreasingThenIncreasing(int[] arr) {
        if (arr.length % 2 == 0) {
            System.out.println("Not !!!! (Decreasing then Increasing)");
            return;
        }
        int mid = arr.length / 2;
        for (int i = 0; i < mid; i++) {
            if (arr[i] - arr[i + 1] != 1) {
                System.out.println("Not !!!! (Decreasing then Increasing)");
                return;
            }
        }
        for (int i = mid; i < arr.length - 1; i++) {
            if (arr[i] - arr[i + 1] != -1) {
                System.out.println("Not !!!!! (Decreasing then Increasing)");
                return;
            }
        }
        System.out.println("----------------------Strictly Decreasing then Increasing--------------------------------");
    }
    public static void execution() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int digit = sc.nextInt();
        int size = digitSize(digit);
        int[] arr = new int[size];
        int i = 0;
        while (digit != 0) {
            arr[i++] = digit % 10;
            digit /= 10;
        }
        arr = reverse(arr);
        strictlyIncreasing(arr);
        strictlyDecreasing(arr);
        increasingThenDecreasing(arr);
        decreasingThenIncreasing(arr);
        sc.close();
    }
}
