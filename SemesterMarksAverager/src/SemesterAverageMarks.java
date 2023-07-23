import java.util.Scanner;

public class SemesterAverageMarks {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		int sum1 = scan.nextInt();
		int sum2 = scan.nextInt();
		int sum3 = scan.nextInt();
		int sum4 = scan.nextInt();
		int sum5 = scan.nextInt();
		int sum6 = scan.nextInt();
		int sum7 = scan.nextInt();
		int sum8 = scan.nextInt();
		System.out.printf("%.2f\n",calculateAverage(sum1,sum2,sum3,sum4,sum5,sum6,sum7,sum8));
		
	}
	public static double calculateAverage(int sem1, int sem2, int sem3, int sem4, int sem5, int sem6, int sem7, int sem8)
	{
		return (sem1+sem2+sem3+sem4+sem5+sem6+sem7+sem8)/8.0;
	}

}
