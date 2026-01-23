package Advance;
public class BubbleSort {
//	public static int[] arr=new int[] {5,2,8,2,1};
	public static void exec(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			int temp=0;
			for(int j=0;j<arr.length-1;j++){
				if(arr[j]>arr[j+1]){
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	public static void display(int[] arr) {
			for(int i:arr) {
			System.out.println(i+" ");
			}
	}
	public static void execReverse(int arr[]){
		for(int i=0;i<arr.length-1;i++) {
			int temp=0;
			for(int j=0;j<arr.length-1;j++){
				if(arr[j]<arr[j+1]){
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
}
