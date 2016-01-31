package loya.Customer;
import java.util.Scanner;


public class CustomerApp {

    public static void main(String[] args) {

        System.out.println("Welcome to the Customer Viewer\n");
        Scanner sc = new Scanner(System.in);
        String continueLoop = "y";
        String customerNumber;

        while(continueLoop.equalsIgnoreCase("y")){

            System.out.print("Enter a customer number: ");
            customerNumber = sc.nextLine();
            System.out.println();
            int number = Integer.parseInt(customerNumber);

            Customer customer = CustomerDB.getCustomer(number);

            if(customer != null){
                System.out.println();
                System.out.println(customer.getNameAndAddress());
                System.out.println();
                System.out.print("Display another customer? (y/n): ");
                continueLoop = sc.nextLine();
                System.out.println();

            }

            else{

                System.out.println("There is no customer number " + number + " in our records.\n");
                System.out.print("Display another customer? (y/n): ");
                continueLoop = sc.nextLine();
                System.out.println();
            }

        }



    }

}
