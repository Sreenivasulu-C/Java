import java.util.Scanner;
public class StringArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the no.of Persons");
		String arr[] = new String[scan.nextInt()];
		System.out.println("Enter people count");
		for(int i=0; i<=arr.length-1;i++)
		{
			arr[i] = scan.next();
		}
		for(int i=0; i<=arr.length-1;i++)
		{
			System.out.println(i+" person is "+ arr[i]);
			scan.close();
		}			
	}
}
