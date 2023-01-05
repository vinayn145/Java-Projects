import java.util.Scanner;
public class GcdApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two numbers to find factorial ");
		int m=scan.nextInt();
		int n=scan.nextInt();
		gcd gcd=new gcd();
		int res=gcd.gcd(m,n);
		System.out.println("Factorial of numbers "+ m +"and "+ n + "is "+res);
	}
}
