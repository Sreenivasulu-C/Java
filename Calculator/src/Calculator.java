import java.util.Scanner;

public class Calculator 
{
	Scanner scan = new Scanner(System.in);
	
	
	int addition()
	{
		System.out.println("Enter 2 vlues");
		int a = scan.nextInt();
		int b = scan.nextInt();
		return a+b;
	}
	int subtraction()
	{
		System.out.println("Enter 2 vlues");
		int a = scan.nextInt();
		int b = scan.nextInt();
		return b-a;
	}
	int multiplication()
	{
		System.out.println("Enter 2 vlues");
		int a = scan.nextInt();
		int b = scan.nextInt();
		return a*b;
	}
	int division()
	{
		System.out.println("Enter 2 vlues");
		int a = scan.nextInt();
		int b = scan.nextInt();
		return a/b;
	}
	int findReminder()
	{
		System.out.println("Enter 2 vlues");
		int a = scan.nextInt();
		int b = scan.nextInt();
		return a%b;
	}
	int findSquare()
	{
		System.out.println("Enter the value");
		int i = scan.nextInt();
		return i*i;
	}

}
