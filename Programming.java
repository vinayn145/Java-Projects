// WAIP to read elements to an array and print the contents
import java.util.Scanner;
public class Programming {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the size of an array");
	int n=scan.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<=arr.length-1;i++ ){
		arr[i]=scan.nextInt();
	}
	System.out.println(" Array elements are");
	for(int i=0;i<=arr.length-1;i++ ){
		System.out.print(arr[i]+" ");
	}
	}
}
