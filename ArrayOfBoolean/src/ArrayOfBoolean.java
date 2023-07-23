import java.util.Scanner;

public class ArrayOfBoolean {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the no.of persons");
		Boolean arr[] = new Boolean[scan.nextInt()];
		
		System.out.println("enter married or not");
		for(int i=0; i<=arr.length-1;i++)
		{
			arr[i] = scan.nextBoolean();
		}
		for(int i=0; i<=arr.length-1;i++)
		{
			System.out.println(i+" "+"person is married"+">>>>>"+arr[i]);
			scan.close();
		}
	}

}

