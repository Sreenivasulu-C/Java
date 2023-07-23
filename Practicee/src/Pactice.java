import java.util.Scanner;

public class Pactice {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of N:");
		int n = scan.nextInt();
		int sum =0;
		for (int i=1; i<=n;i++)
		{
			sum =sum + i;
			System.out.println("values of each N is:"+sum);
		}
		System.out.println("Sum of Natural number N is:"+sum);
	
		
		/*int fact = 1;
		for (int i=1; i<=n;i++)
		{
			fact = fact * i;
			System.out.println("value of each  N is :"+fact);
		}
		System.out.println("factorial of"+n+" is:"+fact);*/
		
		
	}
}
