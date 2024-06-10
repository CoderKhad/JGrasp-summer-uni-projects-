
import java.util.Scanner;

public class TotalPriceAmount 
{
 public static void main(String[] args) 
{
  Scanner scanner = new Scanner(System.in);

  //step 0: variable declaration
  double[] price = new double[10];
  double[] amount = new double[10];
  double[] total = new double[10];

  // step 1: ask user input
  for (int i = 0; i < 10; i++) 
{
   //step 2: list of operations
   System.out.print("Enter price[" + (i+1) + "]: ");
   price[i] = scanner.nextDouble();
   System.out.print("Enter amount[" + (i+1) + "]: ");
   amount[i] = scanner.nextDouble();
   total[i] = price[i] * amount[i];
  }

  // Step 3: Display
  System.out.println("\nTotal\tPrice\tAmount");
  for (int i = 0; i < 10; i++) {
   System.out.printf("%.2f\t%.2f\t%.2f%n", total[i], price[i], amount[i]);
  }
 }
}