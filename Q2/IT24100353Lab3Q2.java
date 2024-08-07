import java.util.Scanner;

	public class IT24100353Lab3Q2
	{
		public static void main(String[]args)
		{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the Monthly salary:");
		double salary = scanner.nextDouble();
		System.out.print("Enter the number of OT hours:");
		double othours = scanner.nextDouble();
		System.out.print("Enter the OT hourly rate:");
		double otrate = scanner.nextDouble();
		double total = salary + (othours*otrate);
		System.out.println("The Total Salary with including OT:"+total);
		}
	}
		
		