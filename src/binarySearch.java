import java.util.Scanner;
public class binarySearch {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter size of array ");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter array elements ");
		for(int i=0;i<=arr.length-1;i++){
			arr[i]=scan.nextInt();
		}
		System.out.println("Enter key element to search");
		int key=scan.nextInt();
		int low=0;
		int high=arr.length-1;
		binary bin=new binary();
		int res=bin.binarySearch(arr, low, high, key);
		if(res==-1){
			System.out.println("Element not present");
		}
		else{
			System.out.println("Element present at index "+res);
		}
	}
}
