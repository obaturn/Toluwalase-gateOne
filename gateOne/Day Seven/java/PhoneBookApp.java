import java.util.ArrayList;
import java.util.Scanner;

public class PhoneBookApp {

    static ArrayList<String> firstNameArray = new ArrayList<String>();
    static ArrayList<String> secondNameArray = new ArrayList<String>();
    static ArrayList<String> phoneNumberArray = new ArrayList<String>();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            String prompt = """
                    1 -> Add Contact
                    2 -> Remove Contact
                    3 -> Find Contact
                    4 -> Find Contact By LastName
                    5 -> Edit Contact
                    6 -> Exit
                    choose your option
                    """;

            System.out.println(prompt);
            int userInput = input.nextInt();
            

            switch (userInput) {
                case 1:
                    System.out.println("WELCOME TO ADDING OF CONTACT");
                    System.out.println("enter your first name you wish to save: ");
                    String firstName = input.nextLine();
                    firstNameArray.add(firstName);

                    System.out.println("enter your last name you wish to save: ");
                    String lastName = input.nextLine();
                    secondNameArray.add(lastName);

                    System.out.println("phone number: ");
                    String number = input.nextLine();
                    while (number.length() != 11) {
                        System.out.println("the number you enter has to be 11 digits Please enter a valid one.");
                        number = input.nextLine();
                    }
                    phoneNumberArray.add(number);
                    break;

                case 2:
                    System.out.println("WELCOME TO REMOVE CONTACT");
                    if (!firstNameArray.isEmpty()) {
                        System.out.println("Enter the contact you wish to remove: ");
                        String contactRemove = input.nextLine();
                        if (firstNameArray.contains(contactRemove)) {
                            int index = firstNameArray.indexOf(contactRemove);
                            firstNameArray.remove(index);
                            secondNameArray.remove(index);
                            phoneNumberArray.remove(index);
                            System.out.println("Contact " + contactRemove + " removed successfully.");
                        } else {
                            System.out.println("Contact not found.");
                        }
                    } else {
                        System.out.println("Phone book is empty.");
                    }
                    break;

                case 3:
                    System.out.println("WELCOME TO FIND CONTACT");
                    if (!firstNameArray.isEmpty()) {
                        System.out.println("Enter the contact you want to find: ");
                        String findContact = input.nextLine();
                        if (firstNameArray.contains(findContact)) {
                            System.out.println("The contact " + findContact + " is found.");
                        } else {
                            System.out.println("The contact " + findContact + " not found.");
                        }
                    } else {
                        System.out.println("Phone book is empty.");
                    }
                    break;

                default:
                    System.out.println("Invalid option. Please choose a valid option.");
            }
        }
    }
}
