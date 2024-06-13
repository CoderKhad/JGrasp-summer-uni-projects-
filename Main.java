
import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
   {
		// Step 0: Variable declarations
		ProductionWorker worker;
		Scanner keyboard = new Scanner(System.in);

		// Step 1: Ask user input
		System.out.print("Enter employee name: ");
		String name = keyboard.nextLine();
		System.out.print("Enter employee number: ");
		int number = keyboard.nextInt();
		System.out.print("Enter hire date (YYYY-MM-DD): ");
		String hireDate = keyboard.next();
		System.out.print("Enter shift (1 for day, 2 for night): ");
		int shift = keyboard.nextInt();
		System.out.print("Enter hourly pay rate: ");
		double hourlyPayRate = keyboard.nextDouble();

		// Step 2: List of operations
		worker = new ProductionWorker(name, number, hireDate, shift, hourlyPayRate);

		// Step 3: Display
		System.out.println("Employee Information:");
		System.out.println("Name: " + worker.getName());
		System.out.println("Number: " + worker.getNumber());
		System.out.println("Hire Date: " + worker.getHireDate());
		System.out.println("Shift: " + worker.getShift());
		System.out.println("Hourly Pay Rate: " + worker.getHourlyPayRate());
	}
}