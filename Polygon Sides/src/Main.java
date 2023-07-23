import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the No.Of Sides");
		int sides = scan.nextInt();
		identifyPolygon(sides);
		scan.close();
		
		
	}
	public static void identifyPolygon(int sides) {
		/*switch(sides) { 
		case 3:
			System.out.println("Triangle"); 
			break; 
		case 4: 
			System.out.println("Quadrilateral"); 
			break;
			case 5: 
				System.out.println("Pentagon"); 
				break; 
			case 6: 
				System.out.println("Hexagon"); 
				break;
			default: 
				System.out.println("Polygon"); 
				break;
		}
		*/
		if(sides==3) {
			System.out.println("Triangle");
		}
		if(sides==4) {
			System.out.println("Quadrilateral");
		}
		if(sides==5) {
			System.out.println("Pentagon");
		}
		if(sides==6) {
			System.out.println("Hexagon");
		}
	}

}
