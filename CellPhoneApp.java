
import java.util.Scanner;

public class CellPhoneApp 
{
    //step 0: variable declarations 
    public static void main(String[] args) 
    {
        //step 1:ask user input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter phone manufacturer: ");
        String manufact = scanner.nextLine();

        System.out.print("Enter phone model number: ");
        String model = scanner.nextLine();

        System.out.print("Enter phone retail price: ");
        double retailPrice = scanner.nextDouble();
        
        //step 2: list of operations
        CellPhone phone = new CellPhone(manufact, model, retailPrice);
         
        //step 3: Display 
        System.out.println("Phone Information:");
        System.out.println("Manufacturer: " + phone.getManufact());
        System.out.println("Model Number: " + phone.getModel());
        System.out.println("Retail Price: $" + phone.getRetailPrice());
    }
}