import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter product code");
		String productCode = scan.nextLine();
		getProduct(productCode);
		scan.close();
	}
	public static void getProduct(String productCode) {
		switch(productCode) {
		case "P01":
			System.out.println("Coca Cola");
			break;
		case "MD01":
			System.out.println("Mountain Due");
			break;
		case "SP01":
			System.out.println("Sprite");
			break;
		case "PEPSI01":
			System.out.println("Pepsi");
		default:
			System.out.println("Coca Cola");
		}
	}
}
