import java.util.Scanner;

public class ArrayBankRedundency {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int arr[][][] = new int[3][][];
		arr[0] = new int[3][];
		arr[1] = new int[2][];
		arr[2] = new int[4][];
		 
		arr[0][0] = new int[3];
		arr[0][1] = new int[4];
		arr[0][2] = new int[2];
		
		arr[1][0] = new int[4];
		arr[1][1] = new int[3];
		
		arr[2][0] = new int[2];
		arr[2][1] = new int[3];
		arr[2][2] = new int[1];
		arr[2][3] = new int[2];
		
	}
}

		/*System.out.println("Enter the no.of banks");
		
		String arr[][] = new String[scan.nextInt()][];
		for (int i=0; i<=arr.length-1;i++)
		{
			System.out.println("Enter 2nd D length for 1st D "+i);
			arr[i] = new String [scan.nextInt()];
		}
		
		
		scan.nextLine();
		
		
		for (int i=0; i<arr.length-1;i++)
		{
			for (int j=0;j<=arr[i].length-1;j++)
			{
				System.out.println("Enter Name of Bank "+i+" Customer "+j);
				arr[i][j]=scan.nextLine();
			}
		}
		
		
		for (int i=0; i<=arr.length-1;i++)
		{
			for (int j=0;j<=arr[i].length-1;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}
}*/
