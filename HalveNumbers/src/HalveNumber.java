import java.util.Scanner;

public class HalveNumber 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		double num = scan.nextDouble();
		System.out.printf("%.2f\n",halveTheNumber(num));
		
	}
	public static double halveTheNumber(double num)
	{
		return num/2;
	}

}
