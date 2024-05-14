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
                    3 -> Find Contact By Phone Number
                    4 -> Find Contact By Last Name
                    5 -> Edit Contact
                    6 -> Exit
                    choose your option
                    """;

            System.out.println(prompt);
            int userInput = input.nextInt();
            input.nextLine();

            switch (userInput) {
                case 1:
                    System.out.println("WELCOME TO ADDING OF CONTACT");
                    do {
                        System.out.println("Enter your first name you wish to save: ");
                        String firstName = input.nextLine();
                        firstNameArray.add(firstName);

                        System.out.println("Enter your last name you wish to save: ");
                        String lastName = input.nextLine();
                        secondNameArray.add(lastName);

                        System.out.print("Enter phone number: ");
                        String number = input.nextLine();
                        while (number.length() != 11) {
                            System.out.println("The number you enter has to be 11 digits. Please enter a valid one.");
                            number = input.nextLine();
                        }
                        phoneNumberArray.add(number);
                        System.out.println("Contact added successfully.");

                        System.out.println("Do you want to add another contact? (yes/no)");
                    } while (input.nextLine().equalsIgnoreCase("yes"));
                    break;

                case 2:
                    System.out.println("WELCOME TO REMOVE CONTACT");
                    if (!firstNameArray.isEmpty()) {
                        System.out.println("1  Remove with first name or 2  Remove with last name: ");
                        String userChoice = input.nextLine();

                        switch (userChoice) {
                            case "1":
                                System.out.print("Enter the first name of the contact you wish to remove: ");
                                String contactRemove = input.nextLine();
                                int index = firstNameArray.indexOf(contactRemove);
                                if (index != -1) {
                                    firstNameArray.remove(index);
                                    secondNameArray.remove(index);
                                    phoneNumberArray.remove(index);
                                    System.out.println("Contact removed successfully.");
                                } else {
                                    System.out.println("Contact not found.");
                                }
                                break;

                            case "2":
                                System.out.print("Enter the last name of the contact you wish to remove: ");
                                String contactLastRemove = input.nextLine();
                                index = secondNameArray.indexOf(contactLastRemove);
                                if (index != -1) {
                                    firstNameArray.remove(index);
                                    secondNameArray.remove(index);
                                    phoneNumberArray.remove(index);
                                    System.out.println("Contact removed successfully.");
                                } else {
                                    System.out.println("Contact not found.");
                                }
                                break;

                            default:
                                System.out.println("Invalid choice pls try to select the right own");
                        }
                    } else {
                        System.out.println("Phone book is empty.");
                    }
                    break;

                case 3:
                    System.out.println("WELCOME TO FIND CONTACT BY PHONE NUMBER");
                    if (!phoneNumberArray.isEmpty()) {
                        System.out.print("Enter the phone number contact you want to find: ");
                        String findContact = input.nextLine();
                        if (phoneNumberArray.contains(findContact)) {
                            System.out.println("The contact " + findContact + " is found.");
                        } else {
                            System.out.println("The contact " + findContact + " not found.");
                        }
                    } else {
                        System.out.println("The Phone book is empty.");
                    }
                    break;

                case 4:
                    System.out.println("WELCOME TO FIND CONTACT BY LAST NAME");
                    if (!secondNameArray.isEmpty()) {
                        System.out.println("Enter the last name you want to find");
                        String customerLastName = input.nextLine();

                        if (secondNameArray.contains(customerLastName)) {
                            System.out.println("The contact " + customerLastName + " is found");
                        } else {
                            System.out.println("The contact " + customerLastName + " is not found");
                        }
                    } else {
                        System.out.println("The Phone book is empty.");
                    }
                    break;

                case 5:
                    System.out.println("WELCOME TO EDIT CONTACT");
                    if (!firstNameArray.isEmpty()) {
                        System.out.println("Edit the first name you wish to edit:");
                        String firstNameEdit = input.nextLine();

                        if (firstNameArray.contains(firstNameEdit)) {
                            System.out.println("The first name " + firstNameEdit + " has been changed successfully");
                        } else {
                            System.out.println("The first name " + firstNameEdit + " cannot be found");
                        }
                    }
                    
                    if (!secondNameArray.isEmpty()) {
                        System.out.println("Edit the last name you wish to edit:");
                        String secondNameEdit = input.nextLine();
                        if (secondNameArray.contains(secondNameEdit)) {
                            System.out.println("The last name " + secondNameEdit + " has been changed successfully");
                        } else {
                            System.out.println("The last name " + secondNameEdit + " was not found");
                        }
                    }
                    
                    if (!phoneNumberArray.isEmpty()) {
                        System.out.println("Enter the phone number you wish to edit:");
                        String numberEdit = input.nextLine();
                        if (phoneNumberArray.contains(numberEdit)) {
                            System.out.println("The phone number " + numberEdit + " has been successfully edited");
                        } else {
                            System.out.println("The phone number " + numberEdit + " was not found, so it can't be edited");
                        }
                    }
                    break;

                case 6:
                    System.out.println("Press 6 to exit");
                    break;

                default:
                    System.out.println("Invalid option. Please choose a valid option.");
            }
        }
    }
}
