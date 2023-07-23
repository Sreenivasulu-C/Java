import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Grade");
		int grade = scan.nextInt();
		gradeCheck(grade);
	}
	public static void gradeCheck(int grade)
	{
		if(grade>50) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
	}
}
