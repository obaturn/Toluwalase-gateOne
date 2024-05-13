import java.util.ArrayList;
import java.util.Scanner;

public class AtmCard {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 0;
        String userName = null;
        String customerLastName = null;
        int customerPassword = 0;
        String moreDetails = null;
        ArrayList<String> firstName = new ArrayList<>();
        ArrayList<String> lastName = new ArrayList<>();
        ArrayList<Integer> userPassword = new ArrayList<>();
	deposit = firstName,lastName,userPassword;

        System.out.println("WELCOME TO OBATURN BANKING AND SERVICES");

        do {
            System.out.println("Enter your first name:");
            userName = input.next();
            firstName.add(userName); 

            System.out.println("Enter your last name:");
            customerLastName = input.next();
            lastName.add(customerLastName);

            System.out.println("Enter your account password:");
            customerPassword = input.nextInt();
            userPassword.add(customerPassword); 

            System.out.println("Is there another user needed to collect his details? Select YES or NO:");
            moreDetails = input.next();

        } while (moreDetails.equalsIgnoreCase("YES"));

  public static int deposit( ArrayList<String> firstName,ArrayList<String> lastName , ArrayList<Integer> userPassword);   
    }
}
