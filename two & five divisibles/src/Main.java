import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two numbers to print common divisibls of entered nums upto 100");
		int n = scan.nextInt();
		int m = scan.nextInt();
		Divisibles(n,m);
		scan.close();
	}
	private static void Divisibles(int n, int m) {
		System.out.println("Common divisibles of 2 and 5 are.......");
		for (int i=1; i<=100;i++)
		{
			if(i%2==0 && i%5==0)
			{
				System.out.println(i);
			}
			
		}
	}
}
