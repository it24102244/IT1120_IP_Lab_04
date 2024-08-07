import java.util.Scanner;

	public class IT24100353Lab3Q1A
	{
		public static void main(String[]args)
		{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the price of 1kg of rice:");
		double pricePerKg = scanner.nextDouble();
		System.out.print("Enter the number of kilograms you want to buy:");
		double kilograms = scanner.nextDouble();
		double totalAmount = pricePerKg * kilograms;
		System.out.println("The total amount is:"+totalAmount);
		}
	}
		
		