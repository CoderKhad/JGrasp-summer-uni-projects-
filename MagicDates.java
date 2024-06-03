
import java.util.Scanner;

public class MagicDates 
{
 public static void main(String[] args) 
 {
   //step 0: variable declarations
   Scanner keyboard = new Scanner(System.in);
   
   //step 1: ask user imputs
   System.out.print("Enter a month (in numeric form): ");
   int month = keyboard.nextInt();

   //step 2: list of operations
   
   //step 3: display
   System.out.print("Enter a day: ");
   int day = keyboard.nextInt();

   System.out.print("Enter a two-digit year: ");
   int year = keyboard.nextInt();

   if (month * day == year) {
   System.out.println("The date is magic!");
  } 
  else 
  {
   System.out.println("The date is not magic.");
  }
 }
}