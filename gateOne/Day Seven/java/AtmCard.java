import java.util.ArrayList;
import java.util.Scanner;

public class AtmCard {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String moreDetails;
        ArrayList<String> firstName = new ArrayList<>();
        ArrayList<String> lastName = new ArrayList<>();
        ArrayList<Integer> userPassword = new ArrayList<>();

        System.out.println("WELCOME TO OBATURN BANKING AND SERVICES");
	i
        do {
            System.out.println("Enter your first name:");
            String userName = input.next();
            firstName.add(userName);

            System.out.println("Enter your last name:");
            String customerLastName = input.next();
            lastName.add(customerLastName);
            int customerPassword;
            do {
                System.out.println("Enter your account password (4 digits only):");
                customerPassword = input.nextInt();
                if (String.valueOf(customerPassword).length() != 4) {
                    System.out.println("Invalid PIN! Please enter exactly 4 digits.");
                }
            } while (String.valueOf(customerPassword).length() != 4);
            userPassword.add(customerPassword);

            System.out.println("Is there another user needed to collect his details? Select YES or NO:");
            moreDetails = input.next();

        } while (moreDetails.equalsIgnoreCase("YES"));

        
        System.out.println("Enter the amount to deposit:");
         depositAmount = input.nextDouble();

       
        deposit(firstName, lastName, userPassword, depositAmount);
    }

    
    public static void deposit(ArrayList<String> firstName, ArrayList<String> lastName, ArrayList<Integer> userPassword, int depositAmount) {
        
        
    }
}
