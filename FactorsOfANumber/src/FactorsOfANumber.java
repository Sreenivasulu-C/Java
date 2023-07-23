import java.util.Scanner;

public class FactorsOfANumber {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the N value");
		int n = scan.nextInt();
		int num =2;
		
		for (int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				System.out.println(i);
			}
		}
	}

}
