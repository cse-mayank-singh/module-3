package Advance;
public class StringSorting {
	public static char[] sort(char[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			char temp='!';
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		return arr;
	}
	public static void exec() {
		String ahh="JaVaRAnI";
		String nums="90835098347";
		char[] arr=ahh.toCharArray();//convert string to char array
		char[] NUM=nums.toCharArray();
		sort(arr);
		sort(NUM);
		for(char i:arr) {
			System.out.print(i);
		}
		System.out.println();
		for(char i:NUM) {
			System.out.print(i);
		}
		System.out.println();
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]);
		}
		System.out.println();
		for(int i=NUM.length-1;i>=0;i--) {
			System.out.print(NUM[i]);
		}
		System.out.println();
		
	}
}
