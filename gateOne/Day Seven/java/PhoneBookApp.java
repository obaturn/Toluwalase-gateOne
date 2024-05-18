
import java.util.ArrayList;
import java.util.Scanner;

public class PhoneBookApp {

    static ArrayList<String> firstNameArray = new ArrayList<>();
    static ArrayList<String> secondNameArray = new ArrayList<>();
    static ArrayList<String> phoneNumberArray = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("WELCOME TO OUR PHONE BOOK APP");
            String prompt = """
            Pls Choose  From The Options Selected Below:
                1 -> Add Contact
                2 -> Remove Contact
                3 -> Find Contact By Phone Number
                4 -> Find Contact By Last Name
                5 -> Edit Contact
                6 -> Exit
                
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
                        String response = input.nextLine();
                        if (!response.equalsIgnoreCase("yes")) {
                            break;
                        }
                    } while (true);
                    break;

                case 2:
                    System.out.println("WELCOME TO REMOVE CONTACT");
                    if (!firstNameArray.isEmpty()) {
                        System.out.println("1 Remove with first name or 2 Remove with last name: ");
                        String userChoice = input.nextLine();

                        switch (userChoice) {
                            case "1":
                                System.out.print("Enter the first name of the contact you wish to remove: ");
                                String contactRemove = input.nextLine();
                                int index = firstNameArray.indexOf(contactRemove);
                                if (index != -1) {
                                    firstNameArray.remove(index);
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
                                    System.out.println("Contact removed successfully.");
                                } else {
                                    System.out.println("Contact not found.");
                                }
                                break;

                            default:
                                System.out.println("Invalid choice, please select the correct option.");
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
                            int index = phoneNumberArray.indexOf(findContact);
                            System.out.println("The contact with phone number " + findContact + " is found: " +
                                    firstNameArray.get(index) + " " + secondNameArray.get(index));
                        } else {
                            System.out.println("The contact with phone number " + findContact + " not found.");
                        }
                    } else {
                        System.out.println("The Phone book is empty.");
                    }
                    break;

                case 4:
                    System.out.println("WELCOME TO FIND CONTACT BY LAST NAME");
                    if (!secondNameArray.isEmpty()) {
                        System.out.println("Enter the last name you want to find: ");
                        String customerLastName = input.nextLine();
                        if (secondNameArray.contains(customerLastName)) {
                            int index = secondNameArray.indexOf(customerLastName);
                            System.out.println("The contact with last name " + customerLastName + " is found: " +
                                    firstNameArray.get(index) + " " + phoneNumberArray.get(index));
                        } else {
                            System.out.println("The contact with last name " + customerLastName + " is not found.");
                        }
                    } else {
                        System.out.println("The Phone book is empty.");
                    }
                    break;

                case 5:
                    System.out.println("WELCOME TO EDIT CONTACT");
                    if (!firstNameArray.isEmpty()) {
                        System.out.println("Enter the first name you wish to edit:");
                        String firstNameEdit = input.nextLine();
                        if (firstNameArray.contains(firstNameEdit)) {
                            int index = firstNameArray.indexOf(firstNameEdit);
                            System.out.println("Enter the new first name: ");
                            String newFirstName = input.nextLine();
                            firstNameArray.set(index, newFirstName);
                            System.out.println("First name has been changed successfully.");
                        } else {
                            System.out.println("First name not found.");
                        }
                    }

                    if (!secondNameArray.isEmpty()) {
                        System.out.println("Enter the last name you wish to edit:");
                        String lastNameEdit = input.nextLine();
                        if (secondNameArray.contains(lastNameEdit)) {
                            int index = secondNameArray.indexOf(lastNameEdit);
                            System.out.println("Enter the new last name: ");
                            String newLastName = input.nextLine();
                            secondNameArray.set(index, newLastName);
                            System.out.println("Last name has been changed successfully.");
                        } else {
                            System.out.println("Last name not found.");
                        }
                    }

                    if (!phoneNumberArray.isEmpty()) {
                        System.out.println("Enter the phone number you wish to edit:");
                        String numberEdit = input.nextLine();
                        if (phoneNumberArray.contains(numberEdit)) {
                            int index = phoneNumberArray.indexOf(numberEdit);
                            System.out.println("Enter the new phone number: ");
                            String newNumber = input.nextLine();
                            while (newNumber.length() != 11) {
                                System.out.println("The number you enter has to be 11 digits. Please enter a valid one.");
                                newNumber = input.nextLine();
                            }
                            phoneNumberArray.set(index, newNumber);
                            System.out.println("Phone number has been changed successfully.");
                        } else {
                            System.out.println("Phone number not found.");
                        }
                    }
                    break;

                case 6:
                    System.out.println("Thanks for exiting our app. Hope you enjoyed our phone app.");
                    System.exit(0);

                default:
                    System.out.println("Invalid option. Please choose a valid option.");
            }
        }
    }
}
