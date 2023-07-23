import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number to check prime or not");
		int n = scan.nextInt();
		for(int i=2;i<=n;i++)
		{
			if(n%i==1)
			{
				System.out.println("entered num  is prime");
				return;
			}	
			System.out.println("Entered number is not prime");
			return;
		}
		
		scan.close();

	}

}
