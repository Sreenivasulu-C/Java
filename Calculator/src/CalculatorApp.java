import java.util.Scanner;

public class CalculatorApp {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("select your choice");
		System.out.println("To perform Addition press +");
		System.out.println("To perform Subtraction press -");
		System.out.println("To perform Multiply press *");
		System.out.println("To perform Division press /");
		System.out.println("To perform Reminder press %");
		System.out.println("To perform Square press ^");
		System.out.println("To perform Stop  press !");
		Calculator cal = new Calculator();
		
		
		char i = scan.next().charAt(0);
		
		while(true)
		{
			if(i=='+')
			{
				System.out.println(cal.addition());
				break;
			}
			if(i=='-')
			{
				System.out.println(cal.subtraction());
				break;
			}
			if(i=='*')
			{
				System.out.println(cal.multiplication());
				break;
			}
			if(i=='/')
			{
				System.out.println(cal.division());
				break;
			}
			if(i=='%')
			{
				System.out.println(cal.findReminder());
				break;
			}
			if(i=='^')
			{
				
				System.out.println(cal.findSquare());
				break;
			}
			if(i=='!')
			{
				break;
			}
			
		}
		
	}

}
