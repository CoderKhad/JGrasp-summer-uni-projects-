
import java.util.Scanner;

public class RetailPrice 
{
	// Step 0: Variable declarations
	double wholesaleCost;
	double markupPercentage;
	double retailPrice;

	public static void main(String[] args) 
{
		RetailPrice program = new RetailPrice();
		program.run();
	}

	public void run() 
{
		// Step 1: Ask user input
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the item's wholesale cost: ");
		wholesaleCost = scanner.nextDouble();
		System.out.print("Enter the item's markup percentage: ");
		markupPercentage = scanner.nextDouble();

		// Step 2: List of operations
		retailPrice = calculateRetail(wholesaleCost, markupPercentage);

		// Step 3: Display
		System.out.printf("The item's retail price is: $%.2f%n", retailPrice);
	}

	// Method to calculate retail price
	public double calculateRetail(double wholesaleCost, double markupPercentage) {
		double markupAmount = wholesaleCost * (markupPercentage / 100);
		return wholesaleCost + markupAmount;
	}
}