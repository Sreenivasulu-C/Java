import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to print divisibles of entered number upto 100");
		int n = scan.nextInt();
		Divisibles(n);
		scan.close();
	}
	public static void Divisibles(int n) 
	{
		switch(n)
		{
		case 2:
			for(int i=1; i<=100;i++)
			{
				if(i%2==0)
				{
					System.out.println("2*"+ i + " =" +(2*i));
				}
			}
			break;
		case 3:
			for(int i=1; i<=100;i++)
			{
				if(i%3==0)
				{
					System.out.println("3*"+ i + " =" +(3*i));
				}
			}
			break;
		case 5:
			for(int i=1; i<=100;i++)
			{
				if(i%5==0)
				{
					System.out.println("5*"+ i + " =" +(5*i));
				}
			}
		}
	}
}
