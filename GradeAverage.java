
import java.util.Scanner;

public class GradeAverage 
{
   public static void main(String[] args)
   {
      //Step 0: Variable declarations*
      Scanner keyboard = new Scanner(System.in);
      int total = 0; 
      int count = 0; 
      int grade; 
   
      //Step 1: ask user input
do 
      {
         System.out.print("Enter a grade (or 999 to quit): ");
         grade = keyboard.nextInt();

      //Step 2: List of operations
      if (grade == 999)
      {
     break;
 }
      if (grade < 0 || grade > 100)
       {
         System.out.println("Invalid grade. Please enter a grade between 0 and 100: ");
         } 
      else 
        {
            total += grade;
            count++;
 }
      //Step 3: Display
} 
      while (true);
      if (count > 0)
 {
   double average = (double) total / count;
   System.out.printf("Average grade: %.2f%n", average);
} 
else 
   {
      System.out.println("No valid grades entered: ");
   }
}
}