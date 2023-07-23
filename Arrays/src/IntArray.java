import java.util.Scanner;

public class IntArray {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		int arr[] = new int[scan.nextInt()];
		System.out.println("Enter the array elements");
		for (int i =0; i<=arr.length-1;i++)
		{
			arr[i] = scan.nextInt();
			
		}
		for (int i =0; i<=arr.length-1;i++)
		{
			System.out.println(arr[i]+" ");
			
		}
		
	}

}
