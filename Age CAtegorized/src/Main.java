import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = scan.nextInt();
		categorizeAge(age);
		scan.close();
		
	}
	public static void categorizeAge(int age) {
		if(age<=12) {
			System.out.println("child");
		}
		else if(age>12 && age<=19) {
			System.out.println("teen");
		}
		else if(age>19 && age<=59) {
			System.out.println("Adult");
		}
		else {
			System.out.println("Senior");
		}
	}

}
